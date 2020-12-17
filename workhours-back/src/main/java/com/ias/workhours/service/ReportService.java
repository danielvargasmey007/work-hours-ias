package com.ias.workhours.service;

import com.ias.workhours.model.Report;

/**
 * The Interface ReportService.
 * @author Anderson Vargas
 */
public interface ReportService {

	/**
	 * Report.
	 *
	 * @param reportDTO the report DTO
	 * @return the report
	 */
	Report report(Report report);
}
