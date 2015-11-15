package net.qingruan.demo.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction extends ActionSupport implements ModelDriven<T>,
		ServletRequestAware, ServletResponseAware, ServletContextAware {

	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
