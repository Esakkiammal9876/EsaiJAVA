package Interface;

public class c1 implements Interf {
	
	private static c1 ob;

	public static void main(String[] args) {
		c1.ob =new c1();
		ob.ab();
		ob.nm();
	}
	
	public void ab() {
		System.out.println("Abstract method ");
	}

}
