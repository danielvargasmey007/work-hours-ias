package com.ias.workhours.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ias.workhours.dto.HoursDTO;
import com.ias.workhours.dto.HoursRequestDTO;
import com.ias.workhours.service.HoursService;

/**
 * The Class HoursServiceImpl.
 * @author Anderson Vargas
 */
@Service
public class HoursServiceImpl implements HoursService {

	/**
	 * Gets the hours cal.
	 *
	 * @param hoursRequestDTO the hours request DTO
	 * @return the hours cal
	 */
	@Override
	@Transactional(readOnly = true)
	public HoursDTO getHoursCal(HoursRequestDTO hoursRequestDTO) {
		
		HoursDTO hoursDTO = new HoursDTO();
		hoursDTO.setNocturnals(0d);
		hoursDTO.setNocturnalsExt(0d);
		hoursDTO.setNormals(0d);
		hoursDTO.setNormalsExt(0d);
		hoursDTO.setSundays(0d);
		hoursDTO.setSundaysExt(0d);

		return hoursDTO;
	}

}
