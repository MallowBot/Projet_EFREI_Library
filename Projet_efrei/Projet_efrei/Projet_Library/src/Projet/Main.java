package Projet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import Projet.Login;
import Projet.models.Book;
import Projet.DbConnection;
import Projet.models.Book;
import Projet.models.Address;


public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void printSeparator1() {
		System.out.printf("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	}
	
	public static void printSeparator2() {
		System.out.printf("\n------------------------------------------------------------------------\n");
	}
	
static void login() {             //Connection à un profile Borrower/Clerk/Librarian
		
		int login = 0;
		Scanner x = new Scanner(System.in);
		login = x.nextInt();
			
		switch(login) {
		
			case 1:
				printSeparator2();
				System.out.println("Veuillez vous authentifier :\n");
				System.out.println("NOM :");
				Scanner x1 = new Scanner(System.in);
				String ID = x1.next();
				System.out.println("PASSWORD :");
				Scanner x2 = new Scanner(System.in);
				String PWD = x2.next();
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

	public static int scanIdFor(String entity) {
		printSeparator1();
		System.out.printf("Search %s by Id:\n", entity);
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		DbConnection db = new DbConnection();
		db.initConnection();
		
		printSeparator1();
		System.out.println("\n  ~ ~ ~ Bienvenue dans le Système de Gestion de la Bibliothèque ~ ~ ~");
		printSeparator1();
		System.out.println("Veuillez choisir l'option à exécuter : \n\n");
		System.out.println(" 1- Login\n 2- Administration\n 3- EXIT");
		printSeparator2();
		System.out.println("Entrez votre choix : ");
		
		login();
		
//		try {
//			ResultSet set = db.executeQuery("SELECT * from BOOK"); /*Appel base Book*\
//			while (set.next()) {
//				int id = set.getInt("Id");
//				String title = set.getString("title");
//				String author = set.getString("author");
//				String synopsis = set.getString("synopsis");
//				String genre = set.getString("genre");
//				String is_issued = set.getString("is_issued");
//				System.out.println(new Book(id, title, author, synopsis, genre, is_issued));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		
//	}	
	}

}

