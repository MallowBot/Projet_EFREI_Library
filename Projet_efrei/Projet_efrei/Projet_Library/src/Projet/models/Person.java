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

	public Person(String name, String lastName, String password, Date dateOfBirth, int adressId, String phone, String genre) {
		this.setName(name);
		this.setLastName(lastName);
		this.setPassword(password);
		this.setDateOfBirth(dateOfBirth);
		this.setAdressId(adressId);
		this.setPhone(phone);
		this.setGenre(genre);
		
	}

	public Person (int personid, String name, String lastName, String password, Date dateOfBirth, int adressId, String phone, String genre) {
		this(name, lastName, password, dateOfBirth, adressId, phone, genre);
		this.setPersonId(personid);
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getAdressId() {
		return adressId;
	}

	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [personId=" + personId + ", name=" + name + ", lastName=" + lastName + ", password=" + password + ", dateOfBirth=" + dateOfBirth +", adressId =" + adressId +", phone=" + phone +", genre=" + genre +"]";
	}

}


