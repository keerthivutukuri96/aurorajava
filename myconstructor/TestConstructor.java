package myconstructor;

public class TestConstructor {
	
	String name;
	int num;
	
	
	public  TestConstructor(String name, int num) {
		 //new TestConstructor(30);
		this(20);
		 this.name = name;
		 this.num = num;
	}
	
	public TestConstructor(int i) {
		
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TestConstructor t = new TestConstructor("pavanbadboyy", 65);
		System.out.println(t.name);
		System.out.println(t.num);
		
		
	}

}
