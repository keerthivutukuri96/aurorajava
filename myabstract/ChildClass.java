package myabstract;

public class ChildClass extends Myabstract2{

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.send();
		c.receive();
		c.poweron();
		c.shutdown();
	}

	@Override
	public void poweron() {
		// TODO Auto-generated method stub
		System.out.println("I am child class poweron method");
		
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("I am child class send method");
	}

	@Override
	public int receive() {
		// TODO Auto-generated method stub
		System.out.println("I am child class receive method");
		return 0;
	}
//	public void shutdown() {
//		System.out.println("I am shutting down in child class");
//	}

}
