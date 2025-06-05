package Multilevel;

public class Child extends Parent{
	public static void main(String[] args) {
		//calling its own method
		Child.cs();
		Child c = new Child();
		c.cn();
		//after inheritance
		Child.ps();
		c.pn();
	}
	
	public static void cs() {
		System.out.println("child class static method ");
	}
	
	public void cn() {
		System.out.println("child class non static method ");
	}

}
