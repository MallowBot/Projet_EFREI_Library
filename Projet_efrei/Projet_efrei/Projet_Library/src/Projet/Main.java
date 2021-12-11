package Projet;

import java.util.Scanner;

import Projet.models.book;
import Projet.models.Address;
// import Projet.models.Address.AddressBuilder;
import Projet.repositories.Books;
import Projet.repositories.Addresses;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void printSeparator() {
		System.out.printf("\n------------------\n");
	}

	public static int scanIdFor(String entity) {
		printSeparator();
		System.out.printf("Search %s by Id:\n", entity);
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Address address = new AddressBuilder("30 rue Tel", "VilleJuif", "75000","France").setAddress2("").setID().build();
		
	}

}
