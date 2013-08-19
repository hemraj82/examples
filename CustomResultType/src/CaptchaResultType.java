import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.dispatcher.StrutsResultSupport;
import com.opensymphony.xwork2.ActionInvocation;

public class CaptchaResultType extends StrutsResultSupport {

	@Override
	protected void doExecute(String finalLocation, ActionInvocation invocation)
			throws Exception {
		HttpServletResponse response = (HttpServletResponse) invocation
				.getInvocationContext().get(HTTP_RESPONSE);
		HttpServletRequest request = (HttpServletRequest) invocation
		.getInvocationContext().get(HTTP_REQUEST);
		HttpSession session=request.getSession();
		response.setContentType("image/jpg");
		CaptchaGenerator cg=new CaptchaGenerator();
		String captchaString=cg.get(response.getOutputStream());
		session.setAttribute("captchaString", captchaString);
	}

}
