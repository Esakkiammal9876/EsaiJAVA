package Methods;

public class M6 {
	public static void main(String[] args) {
		M6 obj = new M6();
		obj.display(3.4,7.5);
		System.out.println(obj.average(33, 24));
		System.out.println(obj.sub(6.5f,3.4f));
		System.out.println(obj.area(5));
		System.out.println(obj.message("gud mrng"));
		System.out.println(obj.printing('a'));
		System.out.println(obj.result(false));
	}
	
	public String message(String r) {
		return r;
	}
	public char printing(char K1) {
		return K1;
	}
	public boolean result(boolean a) {
		return a;
	}
	
	public void display(double h,double c) {
		System.out.println("Area is " + h*c);
	}
	public int average(int a,int b) {
		return (a+b)/2;
	}
	public float sub(float c,float d) {
		return c-d;
	}
	public double area(double m) {
		return m*m;
	}

}
