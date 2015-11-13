package com.zdp.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.zdp.advisor.Advisor;


/**
 * AOP处理器
 * @author zhangjim
 */
public class AopHandler implements InvocationHandler {
	private Object target; // 需要代理的目标对象
	Advisor beforeAdvisor; // 方法前置通知
	Advisor afterAdvisor; // 方法后置通知

	/**
	 * 设置代理目标对象，并生成动态代理对象.
	 * @param target 代理目标对象
	 * @return 返回动态代理对象
	 */
	public Object setObject(Object target) {
		System.out.println("this is proxy");
		this.target = target; // 设置代理目标对象 
		Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this); // 根据代理目标对象生成动态代理对象
		return proxy;
	}

	/**
	 * 若定义了前置处理，则在方法执行前执行前置处理， 若定义了后置处理，则在方法调用后调用后置处理.
	 * 
	 * @param proxy 代理对象
	 * @param method 调用的业务方法
	 * @param args 方法的参数
	 * @return 返回结果信息
	 * @throws Throwable
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("执行invoke");
		if (beforeAdvisor != null) { 
			beforeAdvisor.doInAdvisor(proxy, method, args); // 进行业务方法的前置处理
		}
		method.invoke(target, args); // 执行业务方法
		if (afterAdvisor != null) {
			afterAdvisor.doInAdvisor(proxy, method, args); // 进行业务方法的后置处理
		}
		return null; // 返回结果对象
	}

	/**
	 * 设置方法的前置通知
	 * @param advisor 方法的前置通知
	 */
	public void setBeforeAdvisor(Advisor advisor) {
		System.out.println("this is before");
		this.beforeAdvisor = advisor;
	}

	/**
	 * 设置方法的后置通知
	 * @param advisor 方法的后置通知
	 */
	public void setAfterAdvisor(Advisor advisor) {
		this.afterAdvisor = advisor;
	}
}