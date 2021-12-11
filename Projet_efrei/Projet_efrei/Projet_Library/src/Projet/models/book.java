package Projet.models;

public class book {
	private int ID;
	private String TITLE;
	private String AUTHOR;
	private String SYNOPSIS;
	private String GENRE;
	private String IS_ISSUED;

	public book(String title, String author, String synopsis, String genre, String is_issued) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setSynopsis(synopsis);
	}

	public book(int id, String title, String author, String synopsis, String genre, String is_issued) {
		this(title, author, synopsis, genre, is_issued);
		this.setId(id);
	}

	public int getId() {
		return ID;
	}

	public void setId(int id) {
		this.ID = id;
	}

	public String getTitle() {
		return TITLE;
	}

	public void setTitle(String title) {
		this.TITLE = title;
	}

	public String getAuthor() {
		return AUTHOR;
	}

	public void setAuthor(String author) {
		this.AUTHOR = author;
	}

	public String getSynopsis() {
		return SYNOPSIS;
	}

	public void setSynopsis(String synopsis) {
		this.SYNOPSIS = synopsis;
	}
	
	public String getGenre() {
		return GENRE;
	}

	public void setGenre(String genre) {
		this.GENRE = genre;
	}
	
	public String getIS_issued() {
		return SYNOPSIS;
	}

	public void setIS_issued(String is_issued) {
		this.IS_ISSUED = is_issued;
	}

	@Override
	public String toString() {
		return "Book [id=" + ID + ", title=" + TITLE + ", author=" + AUTHOR + ", synopsis=" + SYNOPSIS + ", genre=" + GENRE +", disponible =" + IS_ISSUED +"]";
	}

}
