package com.zdp.advisor;

import java.lang.reflect.Method;

/**
 * 方法前置通知，它完成方法的前置操作
 * @author zhangjim
 */
public class BeforeMethodAdvisor implements Advisor {
	/**
	 * 在方法执行前所进行的操作
	 */
	public void doInAdvisor(Object proxy, Method method, Object[] args) {
		System.out.println("before process... ");
	}
}
