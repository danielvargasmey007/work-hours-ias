package com.ias.workhours.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hours")
public class HoursController {

	@GetMapping
	public ResponseEntity<Object> getHoursCalc(@RequestBody String usuario) {
		return null;
	}
}
