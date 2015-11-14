package spring.aop;

import org.aspectj.lang.JoinPoint;

public class Check {
/**
 * before		
 * @param j
 */
	public void checkValidity(JoinPoint j){
		System.out.println(j.getTarget());//获得对象
	     System.out.println("------------------验证合法性----------------");
	 }
/**
 * after
 * @param j
 */
	public void addLog(JoinPoint j){
	  System.out.println("------------------添加日志----------------");
	  Object obj[] = j.getArgs();//参数
	   for(Object o :obj){
	    System.out.println(o);
	   }
	   System.out.println("========checkSecurity=="+j.getSignature().getName());//这个是获得方法名
	 }
}
