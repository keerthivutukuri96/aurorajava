package superkeyword;

public class MethodCalling {

	public static void main(String[] args) {
		MethodCalling m = new MethodCalling();
		m.go();
	}
	//Static component --> cannot give a call to non-static component directly.
	
	//Static --> static component can directly give a call to static components
	//Non-Static --> this component can give a call to static component and Non-Static  component
	//Non-Static components cannot be called without an object
	public static void go() {
		System.out.println("Inside Go Method");
		
	}
	
	public void go1() {
		System.out.println("Inside go1 Method");
		go();
		go2();
	}
	public void go2() {
		System.out.println("Inside Go2 Method");
	}
}
