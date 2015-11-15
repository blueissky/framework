package net.qingruan.demo.dao.impl;

import java.util.List;




import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import net.qingruan.demo.dao.NewsDAO;
import net.qingruan.demo.vo.News;

public class NewsDAOImpl implements NewsDAO {

	
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	public void setDataSource(DataSource dataSource)
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	
	@Override
	public void save(News object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(News object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(News object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public News findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDataCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<News> findAll(News object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findPage(int pageNo, int pageSize, News object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDataCount(News object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void batchUpdate(List<News> objects) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<News> findAllByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findAllHots() {
		// TODO Auto-generated method stub
		return null;
	}

}
