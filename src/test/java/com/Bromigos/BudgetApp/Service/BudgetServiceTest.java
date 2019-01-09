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
public class BudgetServiceTest {
	@Autowired
	BudgetService budgetService;
	
	Logger log = Logger.getLogger(BudgetServiceTest.class.toString());
	
	@Test
	public void testAuthenticate() throws Exception{
		String email = "john.doe@gmail.com";
		String password = "password";
		
		boolean result = budgetService.authenticate(email, password);
		
		assertThat(result,is(true));
	}
}
