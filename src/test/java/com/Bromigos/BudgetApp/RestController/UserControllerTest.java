package com.Bromigos.BudgetApp.RestController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.logging.Logger;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserControllerTest {
	@Autowired
	UserController userController;
	
	@Autowired
	MockMvc mockMvc;
	
	Logger log = Logger.getLogger(UserControllerTest.class.toString());
	
	@Test
	public void testAuthenticate() throws Exception {
		String email = "john.doe@gmail.com";
		String password = "password";
		
		this.mockMvc.perform(get("/api/authenticate").param("email", email)
				                                     .param("password", password))
		                                             .andExpect(status().isOk());
	}
}
