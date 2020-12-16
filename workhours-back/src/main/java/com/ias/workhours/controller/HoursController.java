package com.ias.workhours.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ias.workhours.dto.HoursDTO;
import com.ias.workhours.dto.HoursRequestDTO;
import com.ias.workhours.service.HoursService;

/**
 * The Class HoursController.
 */
@RestController
@RequestMapping("/hours")
public class HoursController {

	/** The hours service. */
	private HoursService hoursService;

	/**
	 * Instantiates a new hours controller.
	 *
	 * @param hoursService the hours service
	 */
	@Autowired
	public HoursController(HoursService hoursService) {
		this.hoursService = hoursService;

	}

	/**
	 * Gets the hours calc.
	 *
	 * @param usuario the usuario
	 * @return the hours calc
	 */
	@GetMapping
	public HoursDTO getHoursCalc(@RequestParam(required = true) String idTechnician,
			@RequestParam(required = true) Integer week) {

		return this.hoursService.getHoursCal(new HoursRequestDTO(idTechnician, week));
	}
}
