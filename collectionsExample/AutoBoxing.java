package collectionsExample;

public class AutoBoxing {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		 int var = 20;
		 Integer obj = new Integer(var); //wrapping ---> autoboxing
		 System.out.println(obj); 
		 
		 int i = obj; //unwrapping ---> autounboxing
		 
		 System.out.println(i);
	}

}
