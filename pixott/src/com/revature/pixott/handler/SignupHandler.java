package com.revature.pixott.handler;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.Customerdao;
import com.revature.pixott.model.Customer;

public class SignupHandler {
	public static void display() {
		System.out.println("enter name");
		String name=App.scanner.nextLine();
		System.out.println("enter MobileNumber");
		String mobile=App.scanner.nextLine();
		System.out.println("enter password");
		String password=App.scanner.nextLine();		
	    Customerdao dao = new Customerdao();
		Customer customer = new Customer();
		customer.setName(name);
		customer.setMobileNumber(mobile);
		customer.setPassword(password);
		dao.signup(customer); 
		MainMenuHandler.display();
	}


}