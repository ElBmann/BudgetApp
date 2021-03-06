package com.Bromigos.BudgetApp.Repository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.jboss.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTest {
	@Autowired
	UserRepository userRepository;
	
	Logger log = Logger.getLogger(UserRepositoryTest.class.toString());
	
	@Test
	public void testGetPassword() {
		String email = "john.doe@gmail.com";
		String password = userRepository.getPassword(email);
		assertThat(password,is("password"));
	}
}
