package Collectionframework;

import java.util.ArrayList;

public class Collection {
	
	public static void main(String[] args) {
		
		ArrayList<Double>l=new ArrayList<Double>();// l = []
		
		//add......................
		l.add(3.4);
		l.add(5.6);
		l.add(7.5);
		l.add(32.1);
		l.add(70.3);
		
		System.out.println(l);// l = [3.4,5.6,7.5.....]
		System.out.println(l.size());
		
		//remove....................
		l.remove(3);
		System.out.println(l);
		
		System.out.println(l.size());
		
		//retrive...................
		System.out.println(l.get(3));
		
		
		//for(int x:l) {
			//System.out.println(x);
		//}
		
		//for(String x:l) {
			//System.out.println(x);
		//}
		
		//iteration.................
		for(double x:l) {
			System.out.println(x);
		}
		
	}

}
