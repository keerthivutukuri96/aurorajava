package myinterfaces;

public class ChildClass extends ParentClass implements MyInterface1,MyInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c = new ChildClass();
		c.show();
		c.get();
		c.put();
	}

	@Override
	public void show() {
		System.out.println("I am child class show method");
	}

	@Override
	public void put() {
		// TODO Auto-generated method stub
		System.out.println("I am child class put method");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("I am child class get method");
	}

}
