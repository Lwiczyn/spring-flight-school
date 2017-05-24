package com.spring.flight.school.flightschool.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(CanHasLolCodeController.class)
public class OrlyLolCodeControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void orlyLolCodeMeTest() throws Exception {
		mockMvc.perform(get("")).andExpect(status().is(200))
				.andExpect(content().string("HAI 1.2/nCAN HAS STDIO/nVISIBLE 'HAI WORLD!!!1!/nKTHXBAI"));
	}

	@Test
	public void orlyChezBurgrMeTest() throws Exception {
		mockMvc.perform(get("/chezburgr")).andExpect(status().is(200)).andExpect(content().string("HAS CHEZBURGR"));
	}
}
