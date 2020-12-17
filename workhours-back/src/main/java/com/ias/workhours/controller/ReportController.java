package com.ias.workhours.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ias.workhours.model.Report;
import com.ias.workhours.service.ReportService;

/**
 * The Class ReportController.
 * @author Anderson Vargas
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
	 * @throws Exception 
	 */
	@PostMapping
	public ResponseEntity<Object> report(@Valid @RequestBody Report report) throws Exception {
		if(report.getStartDate().after(report.getEndDate())) {
			throw new Exception("The start date must be before the end date");
		}
		return ResponseEntity.status(HttpStatus.OK).body(this.reportService.report(report));
	}
}
