package net.qingruan.demo.dao.impl;

import java.util.List;

import net.qingruan.demo.dao.NewsDAO;
import net.qingruan.demo.util.ApplicationContextUtil;
import net.qingruan.demo.vo.News;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

/**
 * A data access object (DAO) providing persistence and search support for News
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see net.qingruan.demo.vo.News
 * @author MyEclipse Persistence Tools
 */
//@Transactional
public class NewsDAOImpl implements NewsDAO{
	private static final Logger log = LoggerFactory.getLogger(NewsDAOImpl.class);
	// property constants
	public static final String TITLE = "title";
	public static final String INFO = "info";
	public static final String ADMIN_ID = "adminId";
	public static final String IS_HOT = "isHot";
	public static final String IS_TOP = "isTop";
	public static final String ENABLE = "enable";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(News transientInstance) {
		log.debug("saving News instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(News persistentInstance) {
		log.debug("deleting News instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public News findById(java.lang.Integer id) {
		log.debug("getting News instance with id: " + id);
		try {
			News instance = (News) getCurrentSession().get(
					"net.qingruan.demo.vo.News", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(News instance) {
		log.debug("finding News instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("net.qingruan.demo.vo.News")
					.add(Example.create(instance).enableLike(MatchMode.ANYWHERE)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding News instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from News as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByInfo(Object info) {
		return findByProperty(INFO, info);
	}

	public List findByAdminId(Object adminId) {
		return findByProperty(ADMIN_ID, adminId);
	}

	public List findByIsHot(Object isHot) {
		return findByProperty(IS_HOT, isHot);
	}

	public List findByIsTop(Object isTop) {
		return findByProperty(IS_TOP, isTop);
	}

	public List findByEnable(Object enable) {
		return findByProperty(ENABLE, enable);
	}

	public List findAll() {
		log.debug("finding all News instances");
		try {
			String queryString = "from News";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public News merge(News detachedInstance) {
		log.debug("merging News instance");
		try {
			News result = (News) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(News instance) {
		log.debug("attaching dirty News instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(News instance) {
		log.debug("attaching clean News instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static NewsDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (NewsDAOImpl) ctx.getBean("NewsDAO");
	}
	
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(News object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<News> findAll(News object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findPage(int pageNo, int pageSize, News object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getDataCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getDataCount(News object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<News> findAllByNewsType(Integer newsTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findPageByNewsType(int pageNo, int pageSize,
			Integer newsTypeId) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public static void main(String[] args) {
//		NewsDAOImpl dao = ApplicationContextUtil.getApplicationContext().getBean("NewsDAO",NewsDAOImpl.class);
//		List<News> newses = dao.findAll();
//		for (News news : newses) {
//			System.out.println(news.getTitle());
//		}
//	}

}