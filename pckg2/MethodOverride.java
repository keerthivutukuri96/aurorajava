package pckg2;



public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		potato p1 = new potato();
//		p1.print();
		
		car c1 = new car();
		c1.print();
	}

}

class potato{
	
	public void print(){
		System.out.println("I am potato");
	}
}

class tomato{
	
	public void print(){
		System.out.println("I am tomato");
	}
}

class carrot extends potato{
	
	public void print(){
		System.out.println("I am carrot");
	}
}

class vehicle{
	
	public potato print(){
		System.out.println("I am vehicle, I am returning potato");
		potato p = new potato();
		return p;
	}
}

class car extends vehicle{
	
	public carrot print(){
		System.out.println("I am car, I am returning carrot");
		carrot c = new carrot();
		return c;
	}
	
//	public tomato print(){
//		System.out.println("I am car, I am returning carrot");
//		tomato t = new tomato();
//		return t;
//	}
}
