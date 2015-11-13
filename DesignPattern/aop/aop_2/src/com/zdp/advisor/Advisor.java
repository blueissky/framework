package com.zdp.advisor;

import java.lang.reflect.Method;

/**
 * 通知类接口
 * @author zhangjim
 */
public interface Advisor {
	/**
	 * 所做的操作
	 */
	public void doInAdvisor(Object proxy, Method method, Object[] args);
}