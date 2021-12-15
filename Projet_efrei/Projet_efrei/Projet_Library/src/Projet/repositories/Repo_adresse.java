package Projet.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Projet.DbConnection;
import Projet.abstracts.DAOImpl;
import Projet.models.Address;

public class Repo_adresse {

	
	public class Addresses extends DAOImpl<Address> {

		
			public Addresses(DbConnection conn) {
				super(conn, "Addresses");
			}

			@Override
			protected Address fromResultSet(ResultSet set) throws SQLException {
				int id = set.getInt("id");
				String address = set.getString("address");
				String address2 = set.getString("address2");
				String district = set.getString("district");
				String city = set.getString("city");
				String postalCode = set.getString("postalCode");
				String country = set.getString("country");
				return new Address(id, address, address2, district, city, postalCode, country);
			}

			@Override
			public boolean add(Address address) {
				String sql = String.format("Insert into %s(address, address2, district, city, postalCode, country) values(?,?,?,?,?,?)", tableName);
				try {
					PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
					preparedStatement.setString(1, address.getAddress());
					preparedStatement.setString(2, address.getAddress2());
					preparedStatement.setString(3, address.getDistrict());
					preparedStatement.setString(4, address.getCity());
					preparedStatement.setString(5, address.getPostalCode());
					preparedStatement.setString(6, address.getCountry());					
					preparedStatement.execute();
					return true;
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				return false;
			}

			@Override
			public boolean update(int id, Address address) {
				String sql = String.format("UPDATE %s SET Address=?, Address2=?, District=?, City=?, PostalCode=?, Country=? ) Where Id = ?", tableName);
				try {
					PreparedStatement preparedStatement = this.conn.createPreparedStatement(sql);
					preparedStatement.setString(1, address.getAddress());
					preparedStatement.setString(2, address.getAddress2());
					preparedStatement.setString(3, address.getDistrict());
					preparedStatement.setString(4, address.getCity());
					preparedStatement.setString(5, address.getPostalCode());
					preparedStatement.setString(6, address.getCountry());
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
