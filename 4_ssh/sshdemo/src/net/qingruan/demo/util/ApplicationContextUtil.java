package net.qingruan.demo.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {

	public static ApplicationContext getApplicationContext()
	{
		return new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
