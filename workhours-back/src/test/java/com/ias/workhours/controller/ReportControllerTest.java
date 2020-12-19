package com.ias.workhours.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ias.workhours.model.Report;
import com.ias.workhours.service.ReportService;

/**
 * The Class ReportControllerTest.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ReportController.class)
public class ReportControllerTest {

	public static final String TEST_CONTENT = "{\"idService\":\"2348359\",\"idTechnician\":\"2348359\",\"startDate\":\"2020-12-18 21:00\",\"endDate\":\"2020-12-18 23:00\"}";

	private static final String TEST_ERROR_CONTENT = "{\"idService\":\"2348359\",\"idTechnician\":\"2348359\",\"startDate\":\"2020-12-20 21:00\",\"endDate\":\"2020-12-18 23:00\"}";;

	/** The mvc. */
	@Autowired
	private MockMvc mvc;

	/** The report service. */
	@MockBean
	private ReportService reportService;

	/**
	 * Report test.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void reportTest() throws Exception {
		mvc.perform(post("/reports").contentType(MediaType.APPLICATION_JSON).content(TEST_CONTENT))
				.andExpect(status().is(200));
		verify(reportService, times(1)).report(Mockito.any(Report.class));
	}

	@Test
	public void reportErrorTest() throws Exception {
		mvc.perform(post("/reports").contentType(MediaType.APPLICATION_JSON).content(TEST_ERROR_CONTENT))
				.andExpect(status().is(500));
	}

}
