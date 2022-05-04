package com.revature.pixott.handler;
import com.revature.pixott.app.App;
import com.revature.pixott.dao.*;
import com.revature.pixott.model.*;
public class Login {
	public static void display() {
		System.out.println("enter the mobile number");
		String MobileNumber = App.scanner.next();
		System.out.println("enter password");
		String pass = App.scanner.next();
		
		
		Customerdao dao = new Customerdao();
		Customer customer = dao.getCustomer(MobileNumber);
		if (customer.getPassword().equals(pass)) {
			System.out.println("Login Successful");
			System.out.println(customer.getName());
			UserMenu.display();
		} else {
			System.out.println("Invalid mobile number or password.");
			
		}

	}

}