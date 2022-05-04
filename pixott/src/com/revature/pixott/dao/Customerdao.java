package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.pixott.handler.Login;
import com.revature.pixott.model.Customer;

public class Customerdao {
		public void signup(Customer Customer) {
		String sql ="insert into customer (Name, mobilenumber, Password) values (?, ?, ?)";
		try (
		Connection conn =Util.getConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);	
		) {
			System.out.println("connected successfully.");
			stmt.setString(1, Customer.getName());
			stmt.setString(2, Customer.getMobileNumber());
			stmt.setString(3, Customer.getPassword());
			stmt.execute();
			System.out.print("detail added succfully");

		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			

	}
}
		public Customer getCustomer(String mobile) {
			String sql="select *from customer where mobilenumber=?";
			try(
					Connection conn=Util.getConnection();
					PreparedStatement stmt = conn.prepareStatement(sql);
					
					)
			{
				stmt.setString(1, mobile);
				ResultSet rs=stmt.executeQuery();
				if(rs.next()) {
					Customer  customer=new Customer();
					customer.setId(rs.getInt("id"));
					customer.setMobileNumber(rs.getString("mobilenumber"));
					customer.setName(rs.getString("name"));
					customer.setPassword(rs.getString("password"));
					return customer;
					
				}else {
					System.out.println("invalid login details");
					Login.display();
				}
				
			}catch(SQLException e) {
				System.out.println(e.getMessage());
				
			}
			return null;
		}
}
	