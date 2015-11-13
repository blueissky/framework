package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.bean.User;

public class test {
	public static void main(String[] args) {
		/*web不加载获取spring对象
		 * */
		ApplicationContext xml = new ClassPathXmlApplicationContext("spring/source/spring.xml");	
		User u = (User)xml.getBean("user");
		u.say();
	}
}
