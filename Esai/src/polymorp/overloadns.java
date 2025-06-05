package polymorp;

public class overloadns {
	public static void main(String[] args) {
		overloadns ob = new overloadns();
		ob.area();
		ob.area(4);
		ob.area(3.5);
		ob.area(2.4, 3);
		ob.area(5, 5.6);
		
	}
	
	public  void area() {
		System.out.println("Hi");
	}
	
	public  void area(int side) {
		System.out.println("Area of square is " + side*side);
	}
	
	public void area(double r) {
		System.out.println("Area of circle is " +3.14*r*r);
	}
	
	public  void area(double s,int b) {
		System.out.println("Area of rectangle is " +s*b);
	}
	
	public void area(int b,double s) {
		System.out.println("Area of rectangle is "+5.2*b*s);
	}



}
