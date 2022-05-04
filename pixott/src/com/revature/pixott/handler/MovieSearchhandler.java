package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.MovieSearchdao;
import com.revature.pixott.model.MovieSearch;

public class MovieSearchhandler {
	public static void display() {
		System.out.println("enter the movie name to search ");
		String keyword=App.scanner.nextLine();
		keyword+=App.scanner.nextLine();
		MovieSearchdao search=new  MovieSearchdao();
		List<MovieSearch> movie=search.Search(keyword);
		movie.forEach(System.out::println);
			
		
		}

}
