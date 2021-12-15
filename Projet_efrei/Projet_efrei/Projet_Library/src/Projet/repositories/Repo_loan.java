package Projet.repositories;

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
					String type = set.getString("type");
					String salary = set.getString("salary");
					String desk = set.getString("desk");
					String office = set.getString("office");
					
					return new Loan(loanid, type, salary, desk, office);
				}

				@Override
				public boolean add(Loan Loan) {
					String sql = String.format("Insert into %s(type, salary, desk, office) values(?,?,?,?)", tableName);
					try {
						PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
						preparedStatement.setString(1, Loan.getType());
						preparedStatement.setString(2, Loan.getSalary());
						preparedStatement.setString(3, Loan.getDesk());
						preparedStatement.setString(4, Loan.getOffice());
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
						preparedStatement.setString(1, Loan.getType());
						preparedStatement.setString(2, Loan.getSalary());
						preparedStatement.setString(3, Loan.getDesk());
						preparedStatement.setString(4, Loan.getOffice());
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
