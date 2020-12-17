package com.ias.workhours.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ias.workhours.model.Report;
import com.ias.workhours.repository.ReportRepository;
import com.ias.workhours.service.ReportService;

/**
 * The Class ReportServiceImpl.
 * @author Anderson Vargas
 */
@Service
public class ReportServiceImpl implements ReportService {

	/** The report repository. */
	private ReportRepository reportRepository;

	/**
	 * Instantiates a new report service impl.
	 *
	 * @param reportRepository the report repository
	 */
	@Autowired
	public ReportServiceImpl(ReportRepository reportRepository) {
		this.reportRepository = reportRepository;
	}

	/**
	 * Report.
	 *
	 * @param reportDTO the report DTO
	 * @return the report
	 */
	@Override
	@Transactional
	public Report report(Report report) {
		return this.reportRepository.save(report);
	}

}
