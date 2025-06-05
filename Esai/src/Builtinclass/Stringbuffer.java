package Builtinclass;

public class Stringbuffer {
	public static void main(String[] args) {
		
		StringBuffer n = new StringBuffer("welcome");
		
		System.out.println(n.length());
		System.out.println(n.indexOf("c"));
		System.out.println(n.charAt(1));
		
		System.out.println(n.append("hi")); //n= welcomehi
		System.out.println(n.insert(0, "g"));// n=gwelcomehi
		
		System.out.println(n.deleteCharAt(0));//n = welcomehi
		System.out.println(n.delete(0, 3)); //n=comehi
		
		System.out.println(n.reverse()); // n=ihemoc
		System.out.println(n.reverse()); // n=comehi
		
		System.out.println(n.replace(0, 2, "FFF"));//n=fffmehi
		System.out.println(n.substring(0, 4)); //n=fffm
	}

}
