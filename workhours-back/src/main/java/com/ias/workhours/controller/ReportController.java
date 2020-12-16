package com.ias.workhours.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ias.workhours.model.Report;

@RestController
@RequestMapping("/reports")
public class ReportController {

	@PostMapping
	public ResponseEntity<Object> report(@RequestBody Report report) {
		return null;
	}
}
