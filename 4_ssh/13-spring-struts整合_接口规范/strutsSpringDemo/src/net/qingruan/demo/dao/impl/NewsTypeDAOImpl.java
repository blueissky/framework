package net.qingruan.demo.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import net.qingruan.demo.dao.NewsTypeDAO;
import net.qingruan.demo.vo.NewsType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class NewsTypeDAOImpl implements NewsTypeDAO {

	
	
	public NewsTypeDAOImpl() {
		System.out.println("ππ‘ÏNewsTypeDAOImpl");
	}

	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	public void setDataSource(DataSource dataSource)
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public void save(NewsType object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(NewsType object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(NewsType object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public NewsType findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsType> findAll() {
		String sql = "select * from newsType where enable=1";
		return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<NewsType>(NewsType.class));		
	}

	@Override
	public List<NewsType> findPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDataCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<NewsType> findAll(NewsType object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsType> findPage(int pageNo, int pageSize, NewsType object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDataCount(NewsType object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void batchUpdate(List<NewsType> objects) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		NewsTypeDAO dao = (NewsTypeDAO)ac.getBean("NewsTypeDAO");
		List<NewsType> newsTypes = dao.findAll();
		for (NewsType newsType : newsTypes) {
			System.out.println(newsType.getTitle());
		}
	}

}
