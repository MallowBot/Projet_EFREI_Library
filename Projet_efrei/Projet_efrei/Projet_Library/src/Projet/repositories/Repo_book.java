package Projet.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Projet.DbConnection;
import Projet.abstracts.DAOImpl;
import Projet.models.Book;

public class Repo_book {
	
	

	public class Books extends DAOImpl<Book> {

		public Books(DbConnection conn) {
			super(conn, "Books");
		}

		@Override
		protected Book fromResultSet(ResultSet set) throws SQLException {
			int id = set.getInt("id");
			String title = set.getString("title");
			String author = set.getString("author");
			String synopsis = set.getString("synopsis");
			String genre = set.getString("genre");
			String is_issued = set.getString("is_issued");
			return new Book(id, title, author, synopsis, genre, is_issued);
		}

		@Override
		public boolean add(Book book) {
			String sql = String.format("Insert into %s(title, author, synopsis, genre, is_issued) values(?,?,?,?,?)", tableName);
			try {
				PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
				preparedStatement.setString(1, book.getTitle());
				preparedStatement.setString(2, book.getAuthor());
				preparedStatement.setString(3, book.getSynopsis());
				preparedStatement.setString(4, book.getGenre());
				preparedStatement.setString(5, book.getIS_issued());
				preparedStatement.execute();
				return true;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return false;
		}

		@Override
		public boolean update(int id, Book book) {
			String sql = String.format("UPDATE %s SET Title=?, Author=?, Synopsis=?) Where Id = ?", tableName);
			try {
				PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
				preparedStatement.setString(1, book.getTitle());
				preparedStatement.setString(2, book.getAuthor());
				preparedStatement.setString(3, book.getSynopsis());
				preparedStatement.setString(4, book.getGenre());
				preparedStatement.setString(5, book.getIS_issued());
				preparedStatement.setInt(4, id);
				preparedStatement.execute();
				return true;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return false;
		}

	}

}
