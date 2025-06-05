package Methods;

public class M2 {
	public static void main(String[] args) {
		System.out.println("addition is "+ M2.addition());
		System.out.println("sub is "+ M2.sub());
		System.out.println("Area is "+ M2.area());
		System.out.println(M2.wish());
		System.out.println(M2.letter());
		System.out.println(M2.result());
	}
	
	public static String wish() {
		String w = "welcome";
		return w;
	}
	
	public static char letter() {
		char l = 'T';
		return l;
	}
	
	public static boolean result() {
		boolean res = true;
		return res;
	}
	
	public static int addition() {
		int a = 40;
		int b = 30;
		return a+b;
	}
	
	public static double sub() {
		double a = 3.2;
		double b = 40.3;
		return a-b;	
	}
	
	public static float area() {
		float s = 3.2f;
		return s*s;
	}

}
