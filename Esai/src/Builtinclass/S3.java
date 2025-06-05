package Builtinclass;

import java.util.Scanner;

public class S3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
			System.out.println("Enter ur name:");
			String name=s.nextLine();
			System.out.println("Enter ur age:");
			int age = s.nextInt();
			System.out.println("Enter ur salary: ");
			double sal=s.nextDouble();
			System.out.println("Details are : ");
			System.out.println("Name is "+ name);
			System.out.println("Age is "+ age);
			System.out.println("Salary is "+ sal);
		}
	}




	