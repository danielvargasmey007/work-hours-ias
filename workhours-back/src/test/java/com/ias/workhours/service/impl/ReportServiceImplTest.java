package com.ias.workhours.service.impl;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ias.workhours.model.Report;
import com.ias.workhours.repository.ReportRepository;
import com.ias.workhours.service.ReportService;

@RunWith(SpringRunner.class)
public class ReportServiceImplTest {

	private ReportService reportService;

	@MockBean
	private ReportRepository reportRepository;

	@Before
	public void init() {
		reportService = new ReportServiceImpl(reportRepository);
	}

	@Test
	public void report() {
		reportService.report(this.getReport());
		verify(reportRepository, times(1)).save(Mockito.any(Report.class));

	}

	private Report getReport() {
		Report report = new Report();
		report.setIdService("234565");
		report.setIdTechnician("12345");
		report.setStartDate(new Date());
		report.setEndDate(new Date());

		return report;
	}

}
