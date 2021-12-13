package Projet.models;

public class Book {
	private int id;
	private String title;
	private String author;
	private String synopsis;
	private String genre;
	private String is_issued;

	public Book(String title, String author, String synopsis, String genre, String is_issued) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setSynopsis(synopsis);
		this.setGenre(genre);
		this.setIS_issued(is_issued);
	}

	public Book(int id, String title, String author, String synopsis, String genre, String is_issued) {
		this(title, author, synopsis, genre, is_issued);
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
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
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", synopsis=" + synopsis + ", genre=" + genre +", disponible =" + is_issued +"]";
	}

}
