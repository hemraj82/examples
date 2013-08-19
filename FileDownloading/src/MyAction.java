import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public InputStream getInputStream() throws Exception {
		return new FileInputStream(":/springwebflow_refcardv4.pdf");
	}
}
