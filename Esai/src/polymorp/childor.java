package polymorp;

public class childor {
	public static void main(String[] args) {
		parentor p = new parentor();
		p.area();
		
		childor c = new childor();
		c.area();
	}
	
	public void area() {
		int r=5;
		System.out.println("Area of circle is "+3.14*r*r);
	}

}
