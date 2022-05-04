package com.revature.pixott.handler;
import java.util.*;

import com.revature.pixott.app.App;
public class MainMenuHandler {
	public static void display() {
		System.out.println("PIXOTT");
		System.out.println("mainmenu");
		System.out.println("######");
		System.out.println("1.singnup");
		System.out.println("2.login");
		System.out.println("3.exit");
		System.out.println("enter option : ");
		//Scanner scan= new Scanner(System.in);
		int option=Integer.parseInt(App.scanner.nextLine());
		System.out.println(option);
		if (option== 1) {
			SignupHandler.display();
		}
		else if(option==2)
		{
			
			Login.display();
		}
		else if (option==3) {
			System.out.println("thanks for using pixott");
		}
	}

}