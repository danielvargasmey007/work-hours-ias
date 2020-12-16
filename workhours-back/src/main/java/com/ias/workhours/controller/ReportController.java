package com.ias.workhours.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ias.workhours.dto.HoursRequestDTO;
import com.ias.workhours.dto.ReportDTO;
import com.ias.workhours.service.ReportService;

/**
 * The Class ReportController.
 */
@RestController
@RequestMapping("/reports")
public class ReportController {

	/** The report service. */
	private ReportService reportService;

	/**
	 * Instantiates a new report controller.
	 *
	 * @param reportService the report service
	 */
	@Autowired
	public ReportController(ReportService reportService) {
		this.reportService = reportService;
	}

	/**
	 * Report.
	 *
	 * @param reportDTO the report DTO
	 * @return the response entity
	 */
	@PostMapping
	public ResponseEntity<Object> report(@RequestBody ReportDTO reportDTO) {
		return ResponseEntity.status(HttpStatus.OK).body(this.reportService.report(reportDTO));
	}
}
