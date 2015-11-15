package net.qingruan.demo.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport implements RequestAware,
		ServletRequestAware, ServletResponseAware, SessionAware,
		ApplicationAware, ServletContextAware {

	public String test() throws Exception
	{
		return null;
	}
	private ServletContext application;
	private HttpServletRequest request;
	//ServletContextAware
	@Override
	public void setServletContext(ServletContext application) {
		this.application = application;
	}

	//ApplicationAware
	@Override
	public void setApplication(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

	}

	//sessionAware
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

	}

	//servletResponseAware
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub

	}

	//ServletRequestAware
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

	}

}
