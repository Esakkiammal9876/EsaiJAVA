package Builtinclass;

public class BuiltIn {
	public static void main(String[] args) {
		String n = "welcome";
		
		System.out.println(n.length());
		System.out.println(n.indexOf('m'));
		System.out.println(n.charAt(4));
		
		System.out.println(n+ "hi");
		System.out.println(n.concat("hi"));
		
		System.out.println(n.replace('c', 'f'));
		System.out.println(n.replace("come", "go"));
		
		System.out.println(n.substring(2,6));
		System.out.println(n.contains("k"));
		
	}

}
