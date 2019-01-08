package com.Bromigos.BudgetApp.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Bromigos.BudgetApp.Service.BudgetService;

/**
 * 
 * @author Brecuero
 * @author Ahmedbq
 * Controller class creates the URLs
 */

@RestController
@RequestMapping(value= "/api")
public class BudgetController {

	@Autowired
	BudgetService budgetService; 
	
	@GetMapping(value= "/authenticate")
	public Boolean authenticate(@RequestParam("email") String email,
								@RequestParam("password") String password) {
		return budgetService.authenticate(email, password);
	}
}
