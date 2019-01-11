package com.Bromigos.BudgetApp.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author Brecuero
 * @author Ahmedbq
 * Repository connects to the database
 */

@Repository
public class UserRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String getPassword(String email) {
		String SQL = " SELECT password "
				   + " FROM USERS "
				   + " WHERE email = ? ";
		
		return jdbcTemplate.queryForObject(SQL, new Object[] {email},String.class);
	}

}
