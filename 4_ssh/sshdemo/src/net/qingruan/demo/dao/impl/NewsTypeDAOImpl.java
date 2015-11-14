package net.qingruan.demo.dao.impl;

import java.util.List;

import net.qingruan.demo.dao.NewsTypeDAO;
import net.qingruan.demo.vo.NewsType;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

/**
 * A data access object (DAO) providing persistence and search support for
 * NewsType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see net.qingruan.demo.vo.NewsType
 * @author MyEclipse Persistence Tools
 */
//@Transactional
public class NewsTypeDAOImpl implements NewsTypeDAO {
	private static final Logger log = LoggerFactory
			.getLogger(NewsTypeDAOImpl.class);
	// property constants
	public static final String TITLE = "title";
	public static final String SORT = "sort";
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

	public void save(NewsType transientInstance) {
		log.debug("saving NewsType instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(NewsType persistentInstance) {
		log.debug("deleting NewsType instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NewsType findById(java.lang.Integer id) {
		log.debug("getting NewsType instance with id: " + id);
		try {
			NewsType instance = (NewsType) getCurrentSession().get(
					"net.qingruan.demo.vo.NewsType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(NewsType instance) {
		log.debug("finding NewsType instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("net.qingruan.demo.vo.NewsType")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding NewsType instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from NewsType as model where model."
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

	public List findBySort(Object sort) {
		return findByProperty(SORT, sort);
	}

	public List findByEnable(Object enable) {
		return findByProperty(ENABLE, enable);
	}

	public List findAll() {
		log.debug("finding all NewsType instances");
		try {
			String queryString = "from NewsType";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public NewsType merge(NewsType detachedInstance) {
		log.debug("merging NewsType instance");
		try {
			NewsType result = (NewsType) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(NewsType instance) {
		log.debug("attaching dirty NewsType instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NewsType instance) {
		log.debug("attaching clean NewsType instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static NewsTypeDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (NewsTypeDAOImpl) ctx.getBean("NewsTypeDAO");
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(NewsType object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NewsType> findAll(NewsType object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsType> findPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsType> findPage(int pageNo, int pageSize, NewsType object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getDataCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getDataCount(NewsType object) {
		// TODO Auto-generated method stub
		return 0;
	}
}