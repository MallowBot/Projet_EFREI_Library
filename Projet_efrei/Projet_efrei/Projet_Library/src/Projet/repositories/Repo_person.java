package Projet.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Projet.DbConnection;
import Projet.abstracts.DAOImpl;
import Projet.models.Person;

public class Repo_person extends DAOImpl<Person> {

	public Persons(DbConnection conn) {
			super(conn, "Persons");
		}

		@Override
		protected Person fromResultSet(ResultSet set) throws SQLException {
			int id = set.getInt("Id");
			String name = set.getString("Name");
			String lastName = set.getString("LastName");
			return new Person(id, name, lastName, password, dateOfBirth, adressId, phone, genre);
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
