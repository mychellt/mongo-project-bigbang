package br.com.mongo.bigbang.service.controller.rest;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.BDDMockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import br.com.mongo.bigbang.domain.model.User;
import br.com.mongo.bigbang.domain.port.service.UserService;
import br.com.mongo.bigbang.service.mapper.UserDTOMapper;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
@WebMvcTest(UserRestController.class)
class UserRestControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private UserService service;

	@MockBean
	private UserDTOMapper mapper;

	private User userA;

	private User userB;

	@BeforeEach
	void setUp() {
		userA = User.builder().login("1L").password("SampleA").build();
		userB = User.builder().login("2L").password("SampleB").build();
	}

	// @Test
	void getAll() throws Exception {
		BDDMockito.given(service.getAll()).willReturn(Arrays.asList(userA, userB));

		mvc.perform(MockMvcRequestBuilders.get("/samples/")).andExpect(MockMvcResultMatchers.status().isOk());
	}

}