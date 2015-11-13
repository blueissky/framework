package com.zdp.advisor;

import java.lang.reflect.Method;

/**
 * 方法的后置通知，它完成方法的后置操作
 * @author zhangjim
 */
public class AfterMethodAdvisor implements Advisor {
	/**
	 * 在方法执行后所进行的操作
	 */
	public void doInAdvisor(Object proxy, Method method, Object[] args) {
		System.out.println("after process...");
	}
}