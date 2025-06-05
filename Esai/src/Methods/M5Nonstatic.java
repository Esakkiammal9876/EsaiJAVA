 package Methods;

public class M5Nonstatic {
	public static void main(String[] args) {
		M5Nonstatic obj = new M5Nonstatic();
		obj.addition();
		obj.division();
		
	}
	public void addition()
	{
		double a=3.4;
		double b=2.4;
		System.out.println("Addition is "+ (a+b));
	}
	private void division() {
		float m=4.3f;
		float n=5.6f;
		System.out.println("Division is "+ m/n);
	}
	
	
}
