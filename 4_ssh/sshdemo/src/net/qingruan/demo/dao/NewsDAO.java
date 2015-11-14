package net.qingruan.demo.dao;

import java.util.List;

import net.qingruan.demo.vo.News;

public interface NewsDAO extends CommonDAO<News> {
	List<News> findAllByNewsType(Integer newsTypeId);
	List<News> findPageByNewsType(int pageNo,int pageSize,Integer newsTypeId);
}
