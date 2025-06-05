package Collectionframework;

import java.util.TreeMap;

public class Map {
	public static void main(String[] args) {
		/*
		 * add
		 * remove
		 * retrieve
		 * iteration is depend on keyset
		 * 
		 * 
		 * 
		 */
		TreeMap<Integer,Double>t=new TreeMap<Integer,Double>();
		t.put(0,33.4);
		t.put(1, 56.7);
		t.put(2, 198.7);
		t.put(3,78.2);
	
		System.out.println(t);
		
		/*LinkedHashMap<Integer,Double>t1=new LinkedHashMap<>();
		t1.put(0,33.4);
		t1.put(1, 56.7);
		t1.put(2, 198.7);
		t1.put(3,78.2);
		System.out.println(t1);
		
		HashMap<Integer,Double>t11=new HashMap<>();
		t11.put(0,33.4);
		t11.put(1, 56.7);
		t11.put(2, 198.7);
		t11.put(3,78.2);
		System.out.println(t11)*/
		
		
		t.remove(2);
		System.out.println(t);
		
		System.out.println(t.get(3));
		System.out.println(t.keySet());
		System.out.println(t.values());
		
		for(int x : t.keySet()) {
			System.out.println(x+ "="+ t.get(x));
		}
	}

}
