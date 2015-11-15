package net.qingruan.demo.action;

import java.util.List;
import java.util.Map;

import net.qingruan.demo.dao.NewsTypeDAO;
import net.qingruan.demo.vo.NewsType;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NewsTypeAction extends ActionSupport {
	
	
	public NewsTypeAction() {
		System.out.println("ππ‘ÏNewsTypeAction");
	}

	private NewsTypeDAO newsTypeDAO;
	
	public void setNewsTypeDAO(NewsTypeDAO newsTypeDAO) {
		this.newsTypeDAO = newsTypeDAO;
	}

	public String findAll() throws Exception
	{
		
		List<NewsType> newsTypes = newsTypeDAO.findAll();
		ServletActionContext.getRequest().setAttribute("newsTypes",newsTypes);
		
		return null;
	}
	public String test() throws Exception
	{
		Map<String,Object> session = ActionContext.getContext().getSession();
		session.put("admin", "qingsoft");
		
		return "index";
	}
}
