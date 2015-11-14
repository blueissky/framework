package hibernate.daoimpl;


import hibernate.dao.Aos;
import hibernate.vo.user;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



public class AosImpl extends HibernateDaoSupport implements Aos {

	@Override
	public void find() {
		// TODO Auto-generated method stub
		user user = new user();
		user.setAddress("zang");
		user.setAge(11);
		user.setId(2);
		user.setName("wangba");
		user.setTel("123123");
		SessionFactory sessionFactory = this.getSessionFactory();
		Session session =sessionFactory.openSession();
		session.save(user);
//		Session session = this.getSession();
//		SQLQuery xx = session.createSQLQuery(" SELECT * FROM aos");
//		List zz = xx.list();
		session.close();
//		System.out.println(zz.size());
	}
//	另一种写法
/*	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getKnByVerCode(final String versionCode,final String gradeCode)throws Exception {
		return (List<Object[]>)this.getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public List doInHibernate(Session session)throws HibernateException, SQLException {
				String sql = "SELECT BOOK_ID,BOOK_NAME FROM app_book_list WHERE Teaching_Version_Code = '"+versionCode+"' and Grade_Code in("+gradeCode+") ORDER BY grade_code,book_id";
				return session.createSQLQuery(sql).list();
			}
		});
	}*/

}
