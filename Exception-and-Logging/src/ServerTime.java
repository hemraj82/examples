import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ServerTime extends ActionSupport {
	@Override
	public String execute(){
		System.out.println("Server time checked");
		return SUCCESS;
	}
	
}
