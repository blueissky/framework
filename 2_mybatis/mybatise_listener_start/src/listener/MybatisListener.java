package listener;

import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import mybatise.main.myproject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.PropertyConfigurator;
import org.jboss.weld.context.ApplicationContext;

import util.Log;

public class MybatisListener implements ServletContextListener {
	private SqlSessionFactory sessionFactory;
	@Override
	public void contextDestroyed(ServletContextEvent e) {
		// TODO Auto-generated method stub
		Log.setContext(this,"destory");
	}

	@Override
	public void contextInitialized(ServletContextEvent e) {
		// TODO Auto-generated method stub
		Log.setContext(this,"init");
		InputStream is = myproject.class.getClassLoader().getResourceAsStream("configure.xml");
		sessionFactory = new SqlSessionFactoryBuilder().build(is);
		ServletContext app = e.getServletContext();//将SESSION工程放入APPLICATION中
		app.setAttribute("sessionfactory",sessionFactory);
	}
}
