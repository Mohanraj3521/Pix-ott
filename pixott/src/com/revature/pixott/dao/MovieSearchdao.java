package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.model.MovieSearch;
import com.revature.pixott.model.Top5;

public class MovieSearchdao {
	public  List<MovieSearch> Search(String Keyword) {
		String lmp="%";
		String sql=String.format("select *from movie where name like '%s%s%s' ;",lmp,Keyword,lmp);
		ArrayList<MovieSearch> result =new ArrayList<>();
		try (
				Connection conn =Util.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);	
				) {
		           ResultSet rs=stmt.executeQuery(sql);
		           while(rs.next()){
					MovieSearch review = new MovieSearch();
					review.setName(rs.getString("name"));
					review.setId(rs.getInt("id"));
					result.add(review);
		           }
				}catch (SQLException e) {
					System.out.println(e.getMessage());
				
				}
				return result;
		
	}

		
	}

