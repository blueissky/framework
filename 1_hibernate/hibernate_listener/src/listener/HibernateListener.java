package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateListener implements ServletContextListener {
    private static Configuration configuration = null;
    private static SessionFactory sessionFactory = null;
    private static ServiceRegistry serviceRegistry = null;
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void contextInitialized(ServletContextEvent e) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(HibernateListener.class);
		log.info(" hibernate listener init");
		configuration=new Configuration().configure("hibernate.xml");
		serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		e.getServletContext().setAttribute("sessionFactory",sessionFactory);
	}
//	没用上
//	private static final ThreadLocal<Session> threadLocal = 
//            new ThreadLocal<Session>();
}
