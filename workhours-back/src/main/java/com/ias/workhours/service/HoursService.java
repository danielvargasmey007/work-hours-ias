package com.ias.workhours.service;

import com.ias.workhours.dto.HoursDTO;
import com.ias.workhours.dto.HoursRequestDTO;

/**
 * The Interface HoursService.
 */
public interface HoursService {

	/**
	 * Gets the hours cal.
	 *
	 * @param hoursRequestDTO the hours request DTO
	 * @return the hours cal
	 */
	HoursDTO getHoursCal(HoursRequestDTO hoursRequestDTO);
}
