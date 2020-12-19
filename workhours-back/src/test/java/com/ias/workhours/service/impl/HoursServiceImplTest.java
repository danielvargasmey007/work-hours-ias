package com.ias.workhours.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ias.workhours.dto.HoursDTO;
import com.ias.workhours.dto.HoursRequestDTO;
import com.ias.workhours.model.Report;
import com.ias.workhours.repository.ReportRepository;
import com.ias.workhours.service.HoursService;

/**
 * The Class HoursServiceImplTest.
 */
@RunWith(SpringRunner.class)
public class HoursServiceImplTest {

	/** The hours service. */
	private HoursService hoursService;

	/** The report repository. */
	@MockBean
	private ReportRepository reportRepository;

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
		hoursService = new HoursServiceImpl(reportRepository);
	}

	/**
	 * Gets the hours test.
	 *
	 * @return the hours test
	 */
	@Test
	public void getHoursTest() {
		Mockito.when(reportRepository.findByIdTechnicianAndWeek(Mockito.anyString(), Mockito.any(Integer.class)))
				.thenReturn(this.getReports());
		Assert.assertNotNull(hoursService.getHoursCal(this.gerRQ()));
	}

	@Test
	public void getCurrentHourStatusTest() {
		Mockito.when(reportRepository.findByIdTechnicianAndWeek(Mockito.anyString(), Mockito.any(Integer.class)))
				.thenReturn(this.getReports());
		Assert.assertTrue(hoursService.getCurrentHourStatus(this.getHoursDTO()) == 48d);
	}

	private HoursDTO getHoursDTO() {
		HoursDTO hoursDTO = new HoursDTO();
		hoursDTO.setNormals(20d);
		hoursDTO.setNocturnals(20d);
		hoursDTO.setSundays(8d);
		return hoursDTO;
	}

	/**
	 * Ger RQ.
	 *
	 * @return the hours request DTO
	 */
	private HoursRequestDTO gerRQ() {
		HoursRequestDTO hoursRequestDTO = new HoursRequestDTO();
		hoursRequestDTO.setIdTechnician("12345");
		hoursRequestDTO.setWeek(51);
		return hoursRequestDTO;
	}

	/**
	 * Gets the reports.
	 *
	 * @return the reports
	 */
	private List<Report> getReports() {
		Report report = new Report();
		report.setIdService("234565");
		report.setIdTechnician("12345");
		report.setStartDate(new Date());
		report.setEndDate(new Date());
		List<Report> reports = new ArrayList<>();
		reports.add(report);

		return reports;
	}

}
