package Projet.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Projet.DbConnection;
import Projet.abstracts.DAOImpl;
import Projet.models.Staff;

public class Repo_staff {
	
	public class Staffs	 extends DAOImpl<Staff> {

				
					public Staffs(DbConnection conn) {
						super(conn, "Loans");
					}

					@Override
					protected Staff fromResultSet(ResultSet set) throws SQLException {
						int staffId = set.getInt("staffId");
						String type = set.getString("type");
						String salary = set.getString("salary");
						String desk = set.getString("desk");
						String office = set.getString("office");
						
						return new Loan(staffId, type, salary, desk, office);
					}

					@Override
					public boolean add(Staff Staff) {
						String sql = String.format("Insert into %s(type, salary, desk, office) values(?,?,?,?)", tableName);
						try {
							PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
							preparedStatement.setString(1, Staff.getType());
							preparedStatement.setString(2, Staff.getSalary());
							preparedStatement.setString(3, Staff.getDesk());
							preparedStatement.setString(4, Staff.getOffice());
							preparedStatement.execute();
							return true;
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						return false;
					}

					@Override
					public boolean update(int id, Staff Staff) {
						String sql = String.format("UPDATE %s SET Address=?, Address2=?, District=?, City=?) Where Id = ?", tableName);
						try {
							PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
							preparedStatement.setString(1, Staff.getType());
							preparedStatement.setString(2, Staff.getSalary());
							preparedStatement.setString(3, Staff.getDesk());
							preparedStatement.setString(4, Staff.getOffice());
							preparedStatement.setInt(5, id);
							preparedStatement.execute();
							return true;
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						return false;
					}

				}
}
