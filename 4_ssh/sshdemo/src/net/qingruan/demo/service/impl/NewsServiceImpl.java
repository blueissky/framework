package net.qingruan.demo.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.qingruan.demo.dao.NewsDAO;
import net.qingruan.demo.service.NewsService;

@Transactional
public class NewsServiceImpl implements NewsService {

	private NewsDAO newsDAO;
	
	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}

	@Override
	public void save(NewsService object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(NewsService object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(NewsService object) {
		// TODO Auto-generated method stub

	}

	@Override
	public NewsService findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsService> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsService> findAll(NewsService object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsService> findPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsService> findPage(int pageNo, int pageSize,
			NewsService object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getDataCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getDataCount(NewsService object) {
		// TODO Auto-generated method stub
		return 0;
	}

}
