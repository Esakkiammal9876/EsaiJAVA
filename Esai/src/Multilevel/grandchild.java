package Multilevel;

public class grandchild extends Child{
	public static void main(String[] args) {
		grandchild.gs();
		grandchild g = new grandchild();
		g.gn();
		
		grandchild.cs();
		g.cn();
		
		grandchild.ps();
		g.pn();
	}

	public static void gs() {
		System.out.println("grand child static method ");
	}
	public void gn() {
		System.out.println("grand child non static method ");
	}
}
