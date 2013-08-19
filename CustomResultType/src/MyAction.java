import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {
	private String username;
	private String password;
	private String state;
	private String langs;
private String captcha;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {

		System.out.println(this);
		return "success";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLangs() {
		return langs;
	}

	public void setLangs(String langs) {
		this.langs = langs;
	}

	@Override
	public String toString() {
		return "MyAction [username=" + username + ", password=" + password
				+ ", state=" + state + ", langs=" + langs + "]";
	}

	@Override
	public void validate() {
		HttpSession session=ServletActionContext.getRequest().getSession();
		String c=(String)session.getAttribute("captchaString");
		if(!captcha.equals(c)){
			addFieldError("captcha","Captcha String is invalid.");
		}
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
}
