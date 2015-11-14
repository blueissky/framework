package net.qingruan.demo.dao;
import java.util.List;


public interface CommonDAO<T> {
	void save(T object);
	void delete(T object);
	void delete(Integer id);
	void update(T object);
	T findById(Integer id);
	List<T> findAll();
	List<T> findAll(T object);
	List<T> findPage(int pageNo,int pageSize);
	List<T> findPage(int pageNo,int pageSize,T object);
	long getDataCount();
	long getDataCount(T object);
	
}
