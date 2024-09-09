package map;

import java.util.*;  

public class MapExample1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
	    //Adding elements to map  
		map.put(1, "Levi's");
		map.put(5, "puma");
		map.put(2, "mufti");
		map.put(10, "radtap");
		map.put(6, "h&m");
		map.put(3, "tommy hilfiger");
		
	    //Traversing Map  
		Set<Integer> set = map.keySet();//converting to set so that we can traverse
		
		/*for(int i=0; i<set.size(); i++) {
			String value = map.get(i);
			System.out.println("key :: " + i + "       value :: " + value);
		}*/
		/*
		for(int k : set) {
			String value = map.get(k);
			System.out.println("key : " + "value : " + value);
		}*/
		
		
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()) {
	    //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  

	    }

	}
	

}
