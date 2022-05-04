package com.revature.pixott.handler;
import java.util.List;

import com.revature.pixott.dao.Top5Movies;
import com.revature.pixott.model.Top5;

public class UserTop5 {
	public static void display() {
		Top5Movies user=new Top5Movies();
		List<Top5> show=user.Top();
		System.out.println(String.format("%s %-40s", "id","name"));
		show.forEach(System.out::println);
	}

}