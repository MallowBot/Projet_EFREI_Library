package Projet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Projet.models.Book;
import Projet.DbConnection;
import Projet.models.Book;
import Projet.models.Address;
// import Projet.models.Address.AddressBuilder;
//import Projet.repositories.Books;
//import Projet.repositories.Addresses;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void printSeparator() {
		System.out.printf("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	}

	public static int scanIdFor(String entity) {
		printSeparator();
		System.out.printf("Search %s by Id:\n", entity);
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		DbConnection db = new DbConnection();
		db.initConnection();
		printSeparator();
		try {
			ResultSet set = db.executeQuery("SELECT * from BOOK");
			while (set.next()) {
				int id = set.getInt("Id");
				String title = set.getString("title");
				String author = set.getString("author");
				String synopsis = set.getString("synopsis");
				String genre = set.getString("genre");
				String is_issued = set.getString("is_issued");
				System.out.println(new Book(id, title, author, synopsis, genre, is_issued));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		
	}	
	}
}

