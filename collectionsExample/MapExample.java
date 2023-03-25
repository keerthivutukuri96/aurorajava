package collectionsExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("firstName", "keeru");
		map.put("lastName", "pavan");
		map.put("sub", "collections");
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("firstName"));
		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			System.out.println("Key---> "+key+" values is --->"+map.get(key));
	
		}
	}

}
