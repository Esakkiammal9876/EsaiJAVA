package Collectionframework;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		/*set 
		 * 
		 * can't retrieve
		 * will accept iteration
		 * 
		 * 
		 * 
		 */
		TreeSet<Integer>t=new TreeSet<>();
		t.add(30);
		t.add(60);
		t.add(100);
		t.add(80);
		t.add(20);
		System.out.println(t);
		
		/*LinkedHashSet<Integer>t1=new LinkedHashSet<>();
		t1.add(30);
		t1.add(60);
		t1.add(100);
		t1.add(80);
		t1.add(20);
		System.out.println(t1);*/
		
		/*HashSet<Integer>t11=new HashSet<>();
		t11.add(30);
		t11.add(60);
		t11.add(100);
		t11.add(80);
		t11.add(20);
		System.out.println(t11);*/
		
		
		System.out.println(t.size());
		
		t.remove(60);
		System.out.println(t);
		
		t.add(70);
		System.out.println(t);
		
		for(int x:t) {
			System.out.println(x);
		}
	}

}
