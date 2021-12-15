package Projet.repositories;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Projet.DbConnection;
import Projet.abstracts.DAOImpl;
import Projet.models.Person;

public class Repo_person {


	public class Persons extends DAOImpl<Person> {

	public Persons(DbConnection conn) {
			super(conn, "Persons");
		}

		@Override
		protected Person fromResultSet(ResultSet set) throws SQLException {
			int personid = set.getInt("personId");
			String name = set.getString("name");
			String lastName = set.getString("lastName");
			String password = set.getString("password");
			Date dateOfBirth = set.getDate("dateOfBirth");
			int adressId = set.getInt("adressId");
			String phone = set.getString("phone");
			String genre = set.getString("genre");
			return new Person(personid, name, lastName, password, dateOfBirth, adressId, phone, genre);
		}

		@Override
		public boolean add(Person person) {
			String sql = String.format("Insert into %s(Name, LastName) values(?,?)", tableName);
			try {
				PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
				preparedStatement.setString(1, person.getName());
				preparedStatement.setString(2, person.getLastName());
				preparedStatement.execute();
				return true;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return false;
		}

		@Override
		public boolean update(int id, Person person) {
			String sql = String.format("UPDATE %s SET Name = ?, LastName=? Where Id = ?", tableName);
			try {
				PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
				preparedStatement.setString(1, person.getName());
				preparedStatement.setString(2, person.getLastName());
				preparedStatement.setInt(3, id);
				preparedStatement.execute();
				return true;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return false;
		}

}
}
