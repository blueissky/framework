package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Configure {
	private static Configuration configure = new Configuration();
	private static String location = "hibernate.xml";
	private static SessionFactory sessionFactory;
	private static final ThreadLocal<Session> threadLocal = 
            new ThreadLocal<Session>();
	static {
		sessionFactory=configure.configure(location).buildSessionFactory();	
	}
	public static Session getSession(){
		Session session = threadLocal.get();
		if(session == null || !session.isOpen()){
            session = (sessionFactory != null ) ? sessionFactory.openSession():null;
            threadLocal.set(session);
        }
        return session;
	}
	
}
