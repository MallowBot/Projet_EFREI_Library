package Projet.repositories;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Projet.DbConnection;
import Projet.abstracts.DAOImpl;
import Projet.models.Loan;

public class Repo_loan {
	
	

		public class Loans extends DAOImpl<Loan> {

			
				public Loans(DbConnection conn) {
					super(conn, "Loans");
				}

				@Override
				protected Loan fromResultSet(ResultSet set) throws SQLException {
					int loanId = set.getInt("loanId");
					int borrowerId = set.getInt("borrowerId");
					int bookId = set.getInt("bookId");
					int issuerId = set.getInt("issuerId");
					Date issuedDate = set.getDate("issuedDate");
					int receiverId = set.getInt("receiverId");
					Date returnDate = set.getDate("returnDate");
					return new Loan(loanId, borrowerId, bookId, issuerId, issuedDate, receiverId, returnDate);
				}

				@Override
				public boolean add(Loan Loan) {
					String sql = String.format("Insert into %s(borrowerId, bookId, issuerId, issuedDate, receiverId, returnDate) values(?,?,?,?,?,?)", tableName);
					try {
						PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
						preparedStatement.setInt(1, Loan.getBorrowerId());
						preparedStatement.setInt(2, Loan.getBookId());
						preparedStatement.setInt(3, Loan.getIssuerId());
						preparedStatement.setDate(4, Loan.getIssuedDate());
						preparedStatement.setInt(5, Loan.getReceiverId());
						preparedStatement.setDate(6, Loan.getReturnDate());
						preparedStatement.execute();
						return true;
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					return false;
				}

				@Override
				public boolean update(int id, Loan Loan) {
					String sql = String.format("UPDATE %s SET Address=?, Address2=?, District=?, City=?) Where Id = ?", tableName);
					try {
						PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
						preparedStatement.setInt(1, Loan.getBorrowerId());
						preparedStatement.setInt(2, Loan.getBookId());
						preparedStatement.setInt(3, Loan.getIssuerId());
						preparedStatement.setDate(4, Loan.getIssuedDate());
						preparedStatement.setInt(5, Loan.getReceiverId());
						preparedStatement.setDate(6, Loan.getReturnDate());
						preparedStatement.setInt(7, id);
						preparedStatement.execute();
						return true;
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					return false;
				}

			}

		
	

}
