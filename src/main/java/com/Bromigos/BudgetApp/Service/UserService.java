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
	
	public Boolean authenticateUser(String email, String password) {
		
		String correctPassword = userRepository.getPassword(email);
		
		if(correctPassword.equals(password)) {
			return true;
		}
		return false;
	}
}
