package Projet;

import java.util.Scanner;
import Projet.Main;

public class Login {
	
	static void login() {
		
		int login = 0;
		Scanner x = new Scanner(System.in);
		login = x.nextInt();
			
		switch(login) {
		
			case 1:
				System.out.println("Veuillez vous authentifier :");
			break;
			case 2:
				System.out.println("admin");
			break;
			case 3:
				System.out.println("exit");
				break;
			default:
				System.out.println("exit");
		}
		
	}

}
