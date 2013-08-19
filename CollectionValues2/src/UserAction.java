import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	data.User user;

	public data.User getUser() {
		return user;
	}
	public void setUser(data.User user) {
		this.user = user;
	}
	public String execute(){
		return "success";
	}
}
