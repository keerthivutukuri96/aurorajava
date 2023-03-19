package myabstract;

public abstract class Myabstract2 extends Myabstract1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Myabstract2 ab = new Myabstract2();
//		ab.send();
//		ab.receive();
//		ab.getStatus();
//	}
//
//	@Override
//	public void send() {
//		System.out.println("I am Myabstract2 class send method");
//		
//	}
//
//	@Override
//	public int receive() {
//		System.out.println("I am Myabstract2 class receive method");
//		return 0;
//	}
//	
//	@Override
//	public void getStatus() {
//		System.out.println("Myabstract2:getStatus --> status");
//	}
	
	public abstract void poweron();
	
	public void shutdown() {
		System.out.println("I am shutting down");
	}
		
	
		
	
}
