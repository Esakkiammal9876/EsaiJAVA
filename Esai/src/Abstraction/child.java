package Abstraction;

public class child extends parent{
	
	public static void main(String[] args) {
		
		child c = new child ();
		c.nm();
		c.ab();
		c.cd();
	}
	
	public void ab() { 
		int s=6;
		System.out.println("Area of square is " + s*s);
	}
	
	public void cd() {
		int a = 7;
		int b=2;
		System.out.println("add two num :" +(a+b));
		}  
	
}
