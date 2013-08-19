package dao;

import java.sql.*;
import java.util.ArrayList;

import entities.User;

public class UserDAO {
	private Connection con;
	public UserDAO() {
		try {
			con = DriverManager
					.getConnection("jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=E:\\students\\strutsbatch\\test.mdb");
			System.out.println("connected created : "+con.getCatalog());
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	public int insert(entities.User user) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("insert into user (name,phone,email,address) values(?,?,?,?)");
		ps.clearParameters();
		ps.setString(1, user.getName());
		ps.setInt(2, (int) user.getPhone());
		ps.setString(3, user.getEmail());
		ps.setString(4, user.getAddress());
		return ps.executeUpdate();
	}

	public int update(entities.User user) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("update user set name=?, phone=?, email=?, address=? where id=?");
		ps.clearParameters();
		ps.setString(1, user.getName());
		ps.setInt(2, (int) user.getPhone());
		ps.setString(3, user.getEmail());
		ps.setString(4, user.getAddress());
		ps.setInt(5, user.getId());
		return ps.executeUpdate();
	}

	public int delete(int id) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("delete from user where id=?");
		ps.clearParameters();
		ps.setInt(1,id);
		return ps.executeUpdate();
	}

	public entities.User getUser(int id) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("select * from user where id=" + id);
		ResultSet rs = ps.executeQuery();
		entities.User user = new entities.User();
		if (rs.next()) {
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setPhone(rs.getInt(3));
			user.setEmail(rs.getString(4));
			user.setAddress(rs.getString(5));
		}
		return user;
	}
	public ArrayList<User> getUsers() throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("select * from user");
		ResultSet rs = ps.executeQuery();
		ArrayList<User> users = new ArrayList<entities.User>();
		while (rs.next()) {
			entities.User user = new entities.User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setPhone(rs.getInt(3));
			user.setEmail(rs.getString(4));
			user.setAddress(rs.getString(5));
			users.add(user);
		}
		return users;
	}
	@Override
	public void finalize(){
		try{
			con.close();
			System.out.println("Connection closed and UserDAO destroyed");
		}catch(SQLException e){
			
		}
	}
}
