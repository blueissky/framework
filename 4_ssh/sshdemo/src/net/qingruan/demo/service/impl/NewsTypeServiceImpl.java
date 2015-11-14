package net.qingruan.demo.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.qingruan.demo.dao.NewsTypeDAO;
import net.qingruan.demo.service.NewsTypeService;
import net.qingruan.demo.vo.NewsType;

@Transactional
public class NewsTypeServiceImpl implements NewsTypeService {

	private NewsTypeDAO newsTypeDAO;
	
	public void setNewsTypeDAO(NewsTypeDAO newsTypeDAO) {
		this.newsTypeDAO = newsTypeDAO;
	}

	@Override
	public void save(NewsType object) {
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
	public void update(NewsType object) {
		// TODO Auto-generated method stub

	}

	@Override
	public NewsType findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NewsType> findAll() {
		// TODO Auto-generated method stub
		return null;
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
