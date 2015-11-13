package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybatise.main.model.Aos;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

public class Action extends HttpServlet {
	private Logger log;

	public Action() {
		super();
	}

	public void init() throws ServletException {
		log = Logger.getLogger(Action.class);
		log.info("init");
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		log.info("destory");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SqlSessionFactory sessionFactory = (SqlSessionFactory) this
				.getServletContext().getAttribute("sessionfactory");
		SqlSession session = sessionFactory.openSession();
		String statement = "mybatise.main.dao.aosDao.getAos";// 映射sql的标识字符串
		Aos aos = session.selectOne(statement, 1);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is "+aos.getAddress());
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
