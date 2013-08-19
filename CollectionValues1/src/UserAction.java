import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;

import data.Address;

public class UserAction extends ActionSupport {
	data.User user;

	
	public data.User getUser() {
		return user;
	}


	public void setUser(data.User user) {
		this.user = user;
	}


	public String execute(){
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:mydatasource");
			
			//Insert the data of user object,id value can be set to increatment or you can provide unique value yourself as it is a PK.
			PreparedStatement ps = con.prepareStatement("insert into userTable(id,name) values(?,?)");
			ps.clearParameters();
			ps.setInt(1, user.getId());
			ps.setString(2, user.getName());
			ps.executeUpdate();
			ps.close();
			
			//now insert the multiple addresses for this particular user. You have to user user Id as foregain key in address table to identify the addresses for particular user.
			PreparedStatement ps2 = con.prepareStatement("insert into userAddress(houseNum,city,country,userId) values(?,?,?,?)");
			Collection<Address> addresses = user.getAddresses();
			for (Address address : addresses) {
				ps2.clearParameters();
				ps2.setInt(1, address.getHouseNum());
				ps2.setString(2, address.getCity());
				ps2.setString(2, address.getCountry());
				ps2.setInt(3, user.getId());
				ps2.executeUpdate();
			}
			ps2.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "success";
	}
}
