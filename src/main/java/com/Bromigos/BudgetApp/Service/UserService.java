package com.Bromigos.BudgetApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bromigos.BudgetApp.Repository.UserRepository;
/**
 * 
 * @author Brecuero
 * @author Ahmedbq
 * Service Class handles the business logic
 */
@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public Boolean authenticate(String email, String password) {
		
		String datebasePassword = userRepository.getPassword(email);
		
		if(datebasePassword.equals(password)) {
			return true;
		}
		return false;
	}
}
