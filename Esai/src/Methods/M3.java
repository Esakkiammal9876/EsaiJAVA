package Methods;

public class M3 {
	public static void main(String[] args) {
		System.out.println(M3.addition( ));
		System.out.println(M3.area());
		System.out.println(M3.add());
		System.out.println(M3.name());
		System.out.println(M3.initial());
		System.out.println(M3.result());
	}
	
	public static int addition() {
		int a = 20;
		int b = 60;
		return a+b;
	}
	
	public static double area() {
		double n = 3.2;
		return n*n;
	}
	
	public static float add() {
		float a = 3.2f;
		float b =4.1f;
		float c = 1.1f;
		return a+b+c;
	}
	public static String name() {
		String a = "Esai";
		return a;
	}
	public static char initial() {
		char b = 'M';
		return b;
	}
	public static boolean result() {
		boolean r = false;
		return r;
	}

}
