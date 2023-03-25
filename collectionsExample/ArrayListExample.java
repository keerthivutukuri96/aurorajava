package collectionsExample;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		int a;
		
		ArrayList list = new ArrayList();
		System.out.println(list);
		
		System.out.println(list.size());
		
		list.add(10); // inside add it is an object
		list.add("Keerthi");
		list.add(true);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		
		list.remove(0);
		
		System.out.println(list);
		 
		System.out.println(list.size());
		
//		for(int i=0;i<list.size();i++) {
//		
//			System.out.println(list.get(i));
//		
//		}
		for(Object var:list) {
			System.out.println(var);
		}
		
//		Iterator itr = list.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}

}
