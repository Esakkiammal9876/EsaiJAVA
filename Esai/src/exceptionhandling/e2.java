package exceptionhandling;

public class e2 {
	
public static void main(String[] args) {
		
		try {
			String n = "Hiiii";
			System.out.println(n.charAt(5));
		}
		/*catch(ArithmeticException e){
			System.out.println("Arithmetic Exception ");
		}*/
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("string index of bound ");
		}
		/*catch(Exception e) {
			System.out.println("error");
		}*/
		finally {
			System.out.println("Always execute");
		}
	}

}
