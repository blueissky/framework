package spring.bean;


public class Eos {
	private Aos aos;
	public void setAos(Aos aos) {
		System.out.println("set");
		this.aos = aos;
	}
	public void aaa(){
		this.aos.my();
	}
}
