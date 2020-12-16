package com.ias.workhours.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ias.workhours.dto.ReportDTO;
import com.ias.workhours.model.Report;
import com.ias.workhours.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

	@Override
	@Transactional
	public Report report(ReportDTO reportDTO) {
		// TODO Auto-generated method stub
		return null;
	}


}
