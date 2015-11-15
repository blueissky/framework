package net.qingruan.demo.action;

public interface CommonAction {

	String save() throws Exception;
	String update() throws Exception;
	String delete() throws Exception;
	String findById() throws Exception;
	String findAll() throws Exception;
	String findPage() throws Exception;
	
}
