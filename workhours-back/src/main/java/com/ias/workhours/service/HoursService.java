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

	/**
	 * Gets the current hour status.
	 *
	 * @param hoursDTO the hours DTO
	 * @return the current hour status
	 */
	double getCurrentHourStatus(HoursDTO hoursDTO);
}
