package pckg2;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver d = new latest_driver();		
		latest_driver l = new latest_driver();	
		
		d.give();
		//d.put();
		
		//l.give();
		
		System.out.println(d.a);
		System.out.println(d.b);
//		System.out.println(d.c);
		
		System.out.println(l.a);
		System.out.println(l.b);
		System.out.println(l.c);

	}

}


class driver{

	int a   = 1;
	double b = 2.0;
	
	public void give() {
		System.out.println("I am a give method in driver");
	}
	
	public void take() {
		System.out.println("I am a take method in driver");
	}
	
}

class latest_driver extends driver{
	
	int a   = 3;
	double b = 4.0;
	char c = 'P';
	
	public void give() {
		System.out.println("I am a give method in latest_driver");
	}
	
	public void put() {
		System.out.println("I am a put method in latest driver");
	}
	
}

