package polymorp;

public class overloading {
	public static void main(String[] args) {
		//overloading ol = new overloading();
		overloading.area();
		overloading.area(5);
		overloading.area(3.5);
		overloading.area(2.4, 3);
		overloading.area(5, 5.6);
		
	}
	
	public static void area() {
		System.out.println("Hi");
	}
	
	public static void area(int side) {
		System.out.println("Area of square is " + side*side);
	}
	
	public static void area(double r) {
		System.out.println("Area of circle is " +3.14*r*r);
	} 
	
	public static void area(double s,int b) {
		System.out.println("Area of rectangle is " +s*b);
	}
	
	public static void area(int b,double s) {
		System.out.println("Area of rectangle is "+5.2*b*s);
	}

}
