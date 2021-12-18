package Projet.models;

public class Borrower {
	private int id;
	private String name;
	private String lastname;

	public Borrower(String name, String lastname) {
		this.setName(name);
		this.setLastName(lastname);
	}
	
	public Borrower(int id, String name, String lastname) {
		this(name, lastname);
		this.setId(id);
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Borrower [id=" + id + ", name=" + name + ", lastname=" + lastname + "]";
	}
}
