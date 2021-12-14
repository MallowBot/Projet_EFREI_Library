package Projet.models;

import java.sql.Date;

public class Person {
	
	private int personId;
	private String name;
	private String lastName;
	private String password;
	private Date dateOfBirth;
	private int adressId;
	private String phone;
	private String genre;

	public Person(String name, String lastName, String synopsis, String genre, String is_issued) {
		this.setName(name);
		this.setAuthor(lastName);
		this.setSynopsis(password);
		this.setGenre(genre);
		this.setIS_issued(is_issued);
	}

	public Person (int id, String name, String lastName, String password, String genre, String is_issued) {
		this(name, lastName, password, genre, is_issued);
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return name;
	}

	public void setTitle(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getIS_issued() {
		return synopsis;
	}

	public void setIS_issued(String is_issued) {
		this.is_issued = is_issued;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", synopsis=" + synopsis + ", genre=" + genre +", disponible =" + is_issued +"]";
	}

}


