package Projet.models;

public class Loan {
	private int id;
	private String borrower_id;
	private String book_id;
	private String issuer_id;
	private String issued_date;
	private String receiver_id;
	private String return_date;

	public Loan(String borrower_id, String book_id, String issuer_id, String issued_date, String receiver_id, String return_date) {
		this.setBorrower_id(borrower_id);
		this.setBook_id(book_id);
		this.setIssuer_id(issuer_id);
		this.setIssued_date(issued_date);
		this.setReceiver_id(receiver_id);
		this.setReturn_date(return_date);
	}

	public Loan(int id, String borriwer_id, String book_id, String issuer_id, String issued_date, String receiver_id, String return_date) {
		this(borrower_id, book_id, issuer_id, issued_date, receiver_id, return_date);
		this.setId(id);
	}

	
	////////////////////
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public int getBorriwer_id() {
		return borriwer_id;
	}

	public void setBorriwer_id(int borriwer_id) {
		this.borriwer_id = borriwer_id;
	}
	
	
	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	
	
	public int getIssuer_id() {
		return issuer_id;
	}

	public void setIssuer_id(int issuer_id) {
		this.issuer_id = issuer_id;
	}
	
	
	public int getIssued_date() {
		return issued_date;
	}

	public void setIssued_date(int issued_date) {
		this.issued_date = issued_date;
	}
	
	
	public int getReceiver_id() {
		return receiver_id;
	}

	public void setReceiver_id(int receiver_id) {
		this.receiver_id = receiver_id;
	}
	
	
	public int getReturn_date() {
		return return_date;
	}

	public void setReturn_date(int return_date) {
		this.return_date = return_date;
	}


	@Override
	public String toString() {
		return "Loan [id=" + id + ", borrower=" + borrower_id + ", book=" + book_id + ", issuer=" + issuer_id + ", date="+ return_date+ "]";
	}

}
