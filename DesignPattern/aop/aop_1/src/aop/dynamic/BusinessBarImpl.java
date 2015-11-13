package aop.dynamic;

public class BusinessBarImpl implements BusinessBar {

	@Override
	public String bar(String message) {
		System.out.println("this is businessbarimpl");
		return message;
	}

}
