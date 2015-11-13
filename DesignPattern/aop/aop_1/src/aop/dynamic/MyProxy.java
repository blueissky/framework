package aop.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {
	private Object obj;
	public MyProxy(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result=null;
		System.out.println("执行任务之前");
		result=method.invoke(obj, args);
		System.out.println("执行任务之后");
		return result;
	}
/**
 * 实例化对象	
 * @param obj
 * @return
 */
	public static Object factory(Object obj) {
		Class cls = obj.getClass();
		return Proxy.newProxyInstance(cls.getClassLoader(),
				cls.getInterfaces(), new MyProxy(obj));
	}
}
