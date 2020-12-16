package com.ias.workhours.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * The Class RestControllerAdviceConfig.
 * @author Anderson Vargas
 */
@RestControllerAdvice
public class RestControllerAdviceConfig {

	/**
	 * Catch error.
	 *
	 * @param e the e
	 * @return the object
	 */
	@ExceptionHandler(Throwable.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public Object catchError(Throwable e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("An error occurred please try again later!");
	}

}
