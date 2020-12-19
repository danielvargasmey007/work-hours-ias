package com.ias.workhours.service.impl;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ias.workhours.dto.HoursDTO;
import com.ias.workhours.dto.HoursRequestDTO;
import com.ias.workhours.model.Report;
import com.ias.workhours.repository.ReportRepository;
import com.ias.workhours.service.HoursService;

/**
 * The Class HoursServiceImpl.
 * 
 * @author Anderson Vargas
 */
@Service
public class HoursServiceImpl implements HoursService {

	/** The report repository. */
	private ReportRepository reportRepository;

	/**
	 * Instantiates a new hours service impl.
	 *
	 * @param reportRepository the report repository
	 */
	@Autowired
	public HoursServiceImpl(ReportRepository reportRepository) {
		this.reportRepository = reportRepository;
	}

	/**
	 * Gets the hours cal.
	 *
	 * @param hoursRequestDTO the hours request DTO
	 * @return the hours cal
	 */
	@Override
	@Transactional(readOnly = true)
	public HoursDTO getHoursCal(HoursRequestDTO hoursRequestDTO) {

		List<Report> reports = this.reportRepository.findByIdTechnicianAndWeek(hoursRequestDTO.getIdTechnician(), hoursRequestDTO.getWeek());

		HoursDTO hoursDTO = new HoursDTO(0d, 0d, 0d, 0d, 0d, 0d);

		reports.stream().forEach(report -> {

			Calendar startDate = Calendar.getInstance();
			startDate.setTimeZone(TimeZone.getTimeZone("UTC"));
			startDate.setTime(report.getStartDate());

			Calendar endDate = Calendar.getInstance();
			endDate.setTimeZone(TimeZone.getTimeZone("UTC"));
			endDate.setTime(report.getEndDate());

			Integer sh = startDate.get(Calendar.HOUR_OF_DAY);
			Integer eh = endDate.get(Calendar.HOUR_OF_DAY);
			Integer sd = startDate.get(Calendar.DAY_OF_WEEK);
			Integer ed = endDate.get(Calendar.DAY_OF_WEEK);
			double diference = ChronoUnit.MINUTES.between(startDate.toInstant(), endDate.toInstant()) * 0.0167;

			if (sd == 1 || ed == 1) {
				if (this.getCurrentHourStatus(hoursDTO) < 48) {
					if (diference + this.getCurrentHourStatus(hoursDTO) > 48) {
						double temp = (48 - this.getCurrentHourStatus(hoursDTO));
						hoursDTO.setSundays(hoursDTO.getSundays() + temp);
						hoursDTO.setSundaysExt(diference - temp);
					} else {
						hoursDTO.setSundays(hoursDTO.getSundays() + diference);
					}

				} else {
					hoursDTO.setSundaysExt(hoursDTO.getSundaysExt() + diference);
				}
			} else {
				if (sh >= 7 && eh <= 20 ) {
					if (this.getCurrentHourStatus(hoursDTO) < 48) {
						if (diference + this.getCurrentHourStatus(hoursDTO) > 48) {
							double temp = (48 - this.getCurrentHourStatus(hoursDTO));
							hoursDTO.setNormals(hoursDTO.getNormals() + temp);
							hoursDTO.setNormalsExt(diference - temp);
						} else {
							hoursDTO.setNormals(hoursDTO.getNormals() + diference);
						}

					} else {
						hoursDTO.setNormalsExt(hoursDTO.getNormalsExt() + diference);
					}

				} else if ((sh >= 0 && eh <= 8) || (sh >= 20 && eh <= 23)) {
						if (this.getCurrentHourStatus(hoursDTO) < 48) {
							if (diference + this.getCurrentHourStatus(hoursDTO) > 48) {
								double temp = (48 - this.getCurrentHourStatus(hoursDTO));
								hoursDTO.setNocturnals(hoursDTO.getNocturnals() + temp);
								hoursDTO.setNocturnalsExt(diference - temp);
							} else {
								hoursDTO.setNocturnals(hoursDTO.getNocturnals() + diference);
							}
							
						} else {
							hoursDTO.setNocturnalsExt(hoursDTO.getNocturnalsExt() + diference);
						}
					
				}
			}

		});
		return hoursDTO;
	}

	@Override
	public double getCurrentHourStatus(HoursDTO hoursDTO) {
		return (hoursDTO.getNormals() + hoursDTO.getNocturnals() + hoursDTO.getSundays());
	}
}
