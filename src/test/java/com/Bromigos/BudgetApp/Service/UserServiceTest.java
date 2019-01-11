package com.Bromigos.BudgetApp.Service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {
	@Autowired
	UserService userService;
	
	Logger log = Logger.getLogger(UserServiceTest.class.toString());
	
	@Test
	public void testAuthenticateUser() throws Exception{
		String email = "john.doe@gmail.com";
		String password = "password";
		
		boolean result = userService.authenticateUser(email, password);
		
		assertThat(result,is(true));
	}
}
