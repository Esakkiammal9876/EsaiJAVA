package Hierarchical;

public class Child1 extends Parent{
	public static void main(String[] args) {
		//calling its own method
		Child1.cs1();
		Child1 c = new Child1();
		c.cn1();
		//after inheritance
		Child1.ps1();
		c.pn1();
	}
	
	public static void cs1() {
		System.out.println("child class 1 static method ");
	}
	
	public void cn1() {
		System.out.println("child class 1 non static method ");
	}

}
