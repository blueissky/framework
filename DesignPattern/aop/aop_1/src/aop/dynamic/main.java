package aop.dynamic;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import javax.security.auth.Subject;
import org.junit.Test;

public class main {
	@Test
	public void doing() {
		BusinessFooImpl bfoo = new BusinessFooImpl();
		BusinessBarImpl bbar = new BusinessBarImpl();
		BusinessFoo bf = (BusinessFoo)MyProxy.factory(bfoo);//对象实例化
		bf.foo();
		BusinessBar bb = (BusinessBar)MyProxy.factory(bbar);
		String message = bb.bar("bbbbbb"); 
		System.out.println(message);
	}
}