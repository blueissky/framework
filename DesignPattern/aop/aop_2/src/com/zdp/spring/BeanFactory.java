package com.zdp.spring;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import com.zdp.advisor.Advisor;

/**
 * Bean工厂类
 * @author zhangjim
 */
public class BeanFactory {
	private Map<String, Object> beansMap = new HashMap<String, Object>(); 

	/**
	 * Bean工厂的初始化
	 */
	public void init(String xml) {
		try {
			SAXReader reader = new SAXReader();
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			InputStream ins = classLoader.getResourceAsStream(xml); // 读取指定的配置文件
			Document doc = reader.read(ins);
			Element root = doc.getRootElement();
			AopHandler aopHandler = new AopHandler(); // 创建AOP处理器
			for (Iterator iter = root.elementIterator("bean"); iter.hasNext();) { // 遍历bean 
				Element element = (Element) iter.next(); 
				Attribute id = element.attribute("id"); // 获取bean的属性id、class、aopClass、aopType
				Attribute cls = element.attribute("class");
				Attribute aopClass = element.attribute("aopClass"); 
				Attribute aopType = element.attribute("aopType");
				
				if (aopClass != null && aopType != null) { // 如果配置了aopClass和aopType属性时，需进行拦截操作
					Class advisorClass = Class.forName(aopClass.getText()); // 根据aopClass字符串获取对应的类
					Advisor advisor = (Advisor) advisorClass.newInstance(); // 创建该类的对象 
					if ("before".equals(aopType.getText())) { // 根据aopType的类型来设置前置或后置顾问
						aopHandler.setBeforeAdvisor(advisor);
					} else if ("after".equals(aopType.getText())) {
						aopHandler.setAfterAdvisor(advisor);
					}
				}

				Class clazz = Class.forName(cls.getText()); // 利用Java反射机制，通过class的名称获取Class对象 
				Object obj = clazz.newInstance(); // 创建一个对象 
				
				Object proxy = (Object) aopHandler.setObject(obj); // 产生代理对象proxy
				beansMap.put(id.getText(), proxy); // 将对象放入beansMap中，其中id为key，对象为value
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	/**
	 * 通过bean的id获取bean的对象.
	 * @param beanName bean的id
	 * @return 返回对应对象
	 */
	public Object getBean(String beanName) {
		Object obj = beansMap.get(beanName);
		return obj;
	}
}