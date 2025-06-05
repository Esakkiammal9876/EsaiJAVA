package Collectionframework;

import java.util.Hashtable;

public class HashTable1 {
	public static void main(String[] args) {
		
		Hashtable<Integer,Double>t11=new Hashtable<>();
		t11.put(0,33.4);
		t11.put(1, 56.7);
		t11.put(2, 198.7);
		t11.put(3,78.2);
		System.out.println(t11);
		
		t11.remove(2);
		System.out.println(t11);
		
		System.out.println(t11.get(0));
		System.out.println(t11.keySet());
		System.out.println(t11.values());
		

	}

}
