package polymorp;

public class constoverload {
	public static void main(String[] args) {
		
		constoverload ob = new constoverload();
		constoverload ob1 = new constoverload(5);
		constoverload ob2 = new constoverload(3.5);
		constoverload ob3 = new constoverload(2.4, 3);
		constoverload ob4 = new constoverload(5, 5.6);
		
	}
	
	public constoverload() {
		System.out.println("Hi");
	}
	
	public constoverload(int side) {
		System.out.println("Area of square is " + side*side);
	}
	
	public constoverload(double r) {
		System.out.println("Area of circle is " +3.14*r*r);
	}
	
	public constoverload(double s,int b) {
		System.out.println("Area of rectangle is " +s*b);
	}
	
	public constoverload(int b,double s) {
		System.out.println("Area of rectangle is "+5.2*b*s);
	}



}
