
package pckg2;

import javaproject.First;

public class Sample {

	public static void main(String[] args) {
		int c;
		Sample s = new Sample();
		c = s.add(5);
		System.out.println(c);

	}

	public int add(int a, int b) {

		System.out.println("In method 1");
		return a + b;
	}
	public int add(int a) {

		System.out.println("In method 1.5");
		return a + a;
	}

//	public float add(int a, int b) {
//
//		System.out.println("In method 1");
//		return float(a + b);
//	}

	public void add(double a, int b) {
		System.out.println(a + b);
		System.out.println("In method 2");
	}

	public void add(double a, double b) {
		System.out.println(a + b);
		System.out.println("In method 3");
	}

}
