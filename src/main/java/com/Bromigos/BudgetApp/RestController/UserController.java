package com.Bromigos.BudgetApp.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Bromigos.BudgetApp.Service.UserService;

/**
 * 
 * @author Brecuero
 * @author Ahmedbq
 * Controller class creates the URLs
 */
@CrossOrigin(origins="*", allowedHeaders="*", methods={RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping(value= "/api")
public class UserController {

	@Autowired
	UserService userService; 
	
	@GetMapping(value= "/authenticateUser")
	public Boolean authenticateUser(@RequestParam("email") String email,
								    @RequestParam("password") String password) {
		return userService.authenticateUser(email, password);
	}
}
