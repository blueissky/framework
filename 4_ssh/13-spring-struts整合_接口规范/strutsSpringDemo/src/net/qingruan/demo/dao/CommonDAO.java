package net.qingruan.demo.dao;

import java.util.List;

public interface CommonDAO<T> {
	void save(T object);
	void update(T object);
	void delete(T object);
	void delete(Integer id);
	T findById(Integer id);
	List<T> findAll();
	List<T> findPage(int pageNo,int pageSize);	
	int getDataCount();
	List<T> findAll(T object);
	List<T> findPage(int pageNo,int pageSize,T object);
	int getDataCount(T object);
	void batchUpdate(List<T> objects);
}
