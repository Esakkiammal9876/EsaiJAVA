package operators;

public class LogicalOp {
	public static void main (String[] args) {
		int m=20;
		int n=2;
		System.out.println("And");
		System.out.println(m>10 && n<3);//(20>10 && 2<3)
		System.out.println(m>20 && n==3);
		System.out.println(m==3 && n<3);
		System.out.println(m==0 && n==0);
		System.out.println();
		
		System.out.println("Or");
		System.out.println(m>10 || n<3);
		System.out.println(m>20 || n==3);
		System.out.println(m==3 || n<3);
		System.out.println(m==0 || n==0);
		System.out.println();
		
		System.out.println("Not");
		System.out.println(m==2);
		System.out.println(n!=3);
	}

}
