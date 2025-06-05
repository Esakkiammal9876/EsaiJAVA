package exceptionhandling;

import java.util.Scanner;

public class e3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur age ");
		int age = s.nextInt();
		
		if(age>18) {
			System.out.println("Major");
		}
		else {
			
			System.out.println("Minor");
		}
	
		
	}

}
