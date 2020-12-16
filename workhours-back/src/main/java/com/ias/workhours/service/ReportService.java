package com.ias.workhours.service;

import com.ias.workhours.dto.ReportDTO;
import com.ias.workhours.model.Report;

/**
 * The Interface ReportService.
 */
public interface ReportService {

	/**
	 * Report.
	 *
	 * @param reportDTO the report DTO
	 * @return the report
	 */
	Report report(ReportDTO reportDTO);
}
