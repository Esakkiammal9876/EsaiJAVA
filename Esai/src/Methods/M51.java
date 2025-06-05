package Methods;

public class M51 {
	public static void main(String[] args) {
		M51 obj = new M51();
		System.out.println(obj.add());
		System.out.println(obj.area());
		System.out.println(obj.sub());
		System.out.println(obj.wish());
		System.out.println(obj.initial());
		System.out.println(obj.results());
	}
	public int add () {
		int a=4;
		return a+a;
	}
	public double area() {
		double b=4.5;
		return b*b;
	}
	public float sub() {
		float m=3.2f;
		float n=5.6f;
		return m-n;
	}
	public String wish() {
		String w="sudha";
		return w;
	}
	public char initial() {
		char i='m';
		return i;
	}
	public boolean results() {
		boolean r=true;
		return r;
	}

}
