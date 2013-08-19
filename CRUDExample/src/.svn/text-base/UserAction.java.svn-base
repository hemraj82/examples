import java.sql.SQLException;
import java.util.ArrayList;

import com.opensymphony.xwork2.*;

public class UserAction extends ActionSupport {
	entities.User user;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	dao.UserDAO userDAO = new dao.UserDAO();
	ArrayList<entities.User> users;

	public ArrayList<entities.User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<entities.User> users) {
		this.users = users;
	}

	public entities.User getUser() {
		return user;
	}

	public void setUser(entities.User user) {
		this.user = user;
	}

	public String create() {
		if (user.getId() != 0) {
			return update();
		} else {
			System.out.println("reacord create action invoked");
			try {
				System.out.println(userDAO.insert(user) + " Record intered");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return SUCCESS;
		}
	}

	public String read() {
		System.out.println("record read action invoked");
		try {
			// System.out.println("User ID : "+id);
			user = userDAO.getUser(id);
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
		return SUCCESS;
	}

	public String update() {
		System.out.println("record update action invoked");
		try {
			System.out.println(userDAO.update(user) + " Records Updated");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
		return SUCCESS;
	}

	public String delete() {
		System.out.println("record delete action invoked");
		try {
			System.out.println(userDAO.delete(id) + " Record deleted");
			try {Thread.sleep(1000);} catch (InterruptedException e) {	e.printStackTrace();}
		} catch (SQLException e) {

			e.printStackTrace(System.out);
		}
		return SUCCESS;
	}

	public String listUsers() {
		System.out.println("list user action invoked");
		try {
			users = userDAO.getUsers();
		} catch (SQLException e) {

			e.printStackTrace(System.out);
		}
		return "success";
	}
}
