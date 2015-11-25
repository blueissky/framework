package cn.myapp.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	public void index() {
		this.render("/jsp/index.jsp");
	}
	public void sayHello() {
		String userName = this.getPara("userName");
		String sayHello = "Hello " + userName + "，welcome to JFinal world.";
		System.out.println(userName);
		System.out.println(sayHello);
		this.setAttr("sayHello", sayHello);
		this.render("/jsp/hello.jsp");
	}
}
