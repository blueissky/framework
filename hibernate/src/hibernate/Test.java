package hibernate;

import hibernate.vo.user;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.junit.Before;

public class Test {
	private user users;
	private user users2;
	@Before
	public void aa() {

		users = new user();
		users.setId(20121108);
		users.setName("张三");
		users.setAge(24);
		users.setTel("010-87654321");
		users.setAddress("上海黄浦");

		users2 = new user();
		users2.setId(20121109);
		users2.setName("李四");
		users2.setAge(23);
		users2.setTel("010-12345678");
		users2.setAddress("北京朝阳");

		Session session = Configure.getSession();
//		Transaction trans = session.beginTransaction();
//		session.persist(users);
//		session.persist(users2);
//		trans.commit();
		SQLQuery xx = session.createSQLQuery(" SELECT * FROM aos");
		List zz = xx.list();
		 Logger log = Logger.getLogger(Test.class);
		System.out.println(zz.size());
		session.close();
	}

	@org.junit.Test
	public void bb() {

	}
}
