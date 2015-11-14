package spring.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import spring.aop.General;
import spring.bean.Aos;
import spring.bean.Eos;
import spring.bean.User;

public class Action extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		从加载完的application中获取BEAN 空 异常
		WebApplicationContext application = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		Eos e = (Eos)application.getBean("eos");
		e.aaa();
//		从加载完的application中获取BEAN 空 NULL
		WebApplicationContext application2 = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		User u2 = (User)application2.getBean("user");
		u2.say();
		
		General g = (General)application2.getBean("general");
		g.execute("duan","123213");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
