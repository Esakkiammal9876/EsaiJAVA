package Collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class Queue {
	public static void main(String[] args) {
		
		ArrayBlockingQueue<Double>a = new ArrayBlockingQueue<Double>(6);
		a.add(3.2);
		a.add(2.3);
		a.add(4.5);
		a.add(6.4);
		a.add(4.4);
		a.add(9.0);
		System.out.println(a);
		
		a.remove(4.5);
		System.out.println(a);
		System.out.println(a.size());
		
		//a.add(6.6);

		
		//print the value at the head of the stack
		System.out.println(a.peek());
		System.out.println(a);
		
		
		for(double x:a) {
			System.out.println(x);
		}
		
}
}
