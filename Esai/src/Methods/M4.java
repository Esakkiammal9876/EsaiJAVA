package Methods;

public class M4 {
	public static void main(String[] args) {
		M4.display("dhivya",25);
		M4.display("Sudha", 21);
		System.out.println("Area is "+M4.area(4));
		System.out.println("Product is "+M4.prod(3.4,2.2));
		System.out.println("Average is "+M4.average(4.5f,6.2f));
		System.out.println("sub is "+M4.sub(33));
		System.out.println("Add is "+M4.add(3.2f, 4.4f, 5.6f, 10.1f));
		System.out.println("wishes is "+ M4.wishes("dheri"));
		System.out.println("letter is " +M4.letter('N'));
		System.out.println("result is "+ M4.result(true));
		System.out.println(M4.title("Java selenium"));
		System.out.println(M4.check(true));
		System.out.println(M4.initial('a'));
	}
	
	public static String title(String t) {
		
		return t;
	}
	public static boolean check(boolean c) {
		return c;
	}
	public static char initial(char i) {
		return i;
	}
	
	public static String wishes(String w) {
		return "hi,"+w;
	}
	public static char letter(char l) {
		return l;
	}
	public static boolean result(boolean r) {
		return r;
	}
	

	public static int sub(int a) {
		return a;
	}
	
	public static float add(float a,float b,float c,float d) {
		return a+b+c+d;
	}
	
	
	
	public static int area(int s) {
		return s*s;
	}
	
	public static double prod(double a,double b) {
		return a*b;
	}
	
	public static float average(float a,float b) {
		return (a+b)/2;
	}
	public static void display(String name,int age) {
		System.out.println("Name is " +name);
		System.out.println("Age is " +age);
	}

}
