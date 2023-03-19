package javaproject;

public class First {

	public static void main(String[] args) {
		try {
			System.out.println("starting");
			int a = 10/0;
			System.out.println("ending");
		}
		catch(Exception e) {
			System.out.println("error occured");
			System.out.println(e.getMessage());
		}
		System.out.println("solved");

	}
	protected void add() {
		System.out.println("Hi");
	}

	

}
