package net.qingruan.demo.dao;

import net.qingruan.demo.vo.Admin;

public interface AdminDAO extends CommonDAO<Admin> {

	Admin findByUsernameAndPassword(String username,String password);
	
}
