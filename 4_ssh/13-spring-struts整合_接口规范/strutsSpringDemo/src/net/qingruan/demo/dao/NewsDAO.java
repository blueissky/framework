package net.qingruan.demo.dao;

import java.util.List;

import net.qingruan.demo.vo.News;

public interface NewsDAO extends CommonDAO<News> {

	List<News> findAllByTitle(String title);
	List<News> findAllHots();
	
}
