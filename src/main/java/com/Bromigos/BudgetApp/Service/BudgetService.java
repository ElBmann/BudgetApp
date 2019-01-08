package com.Bromigos.BudgetApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bromigos.BudgetApp.Repository.BudgetRepository;
/**
 * 
 * @author Brecuero
 * @author Ahmedbq
 * Service Class handles the business logic
 */
@Service
public class BudgetService {
	
	@Autowired
	BudgetRepository budgetRepository;
	
	public Boolean authenticate(String email, String password) {
		
		String datebasePassword = budgetRepository.getPassword(email);
		
		if(datebasePassword.equals(password)) {
			return true;
		}
		return false;
	}
}
