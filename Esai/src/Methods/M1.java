package Methods;

public class M1 {
	public static void main(String[] args) {
		M1.addition();
		M1.div();
		
	}
	public static void addition() {
		int a=30;
		int b=20;
		int c=a+b;
		System.out.println("Addition of two numbers " + c);
	}
	private static void div() {
		double m = 3.2;
		double n = 34.2;
		System.out.println("division is "+ m/n);
	}

}

