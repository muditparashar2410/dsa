package com.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashing {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 2);
		map.put(3, 4);
		map.put(5, 6);

//	iterate using map.entry interface using entry set method
		Set<Entry<Integer, Integer>> s = map.entrySet();
		for (Map.Entry<Integer, Integer> it : s) {
			System.out.println(it.getKey() + "  " + it.getValue());
		}

// using map.keySet() method
		for (Integer i : map.keySet())
			System.out.println(i);

		for(Integer j : map.values())
			System.out.println(j);
		
		
		Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = itr.next();
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
		
		
//		Using Lambda Expression
		
		map.forEach((k,v) -> System.out.println(k+" "+v));
		
		
		
		
		
		
	}

}
