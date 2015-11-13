package com.zdp.test;

import com.zdp.service.BusinessService;
import com.zdp.spring.BeanFactory;

public class Client {
	public static void main(String[] args) {
		BeanFactory beanFactory = new BeanFactory();  
		beanFactory.init("beans.xml");
		BusinessService proxy = (BusinessService) beanFactory.getBean("businessService");
		proxy.process();
	}
}
