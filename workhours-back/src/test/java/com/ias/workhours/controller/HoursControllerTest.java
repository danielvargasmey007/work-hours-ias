package com.ias.workhours.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ias.workhours.dto.HoursRequestDTO;
import com.ias.workhours.service.HoursService;

/**
 * The Class HoursControllerTest.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HoursController.class)
public class HoursControllerTest {

	/** The mvc. */
	@Autowired
	private MockMvc mvc;

	/** The hours service. */
	@MockBean
	private HoursService hoursService;

	/**
	 * Show save.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void getHpursTest() throws Exception {
		mvc.perform(get("/hours").param("week", "1").param("idTechnician", "1")).andExpect(status().isOk());
		verify(hoursService, times(1)).getHoursCal(Mockito.any(HoursRequestDTO.class));
	}

}
