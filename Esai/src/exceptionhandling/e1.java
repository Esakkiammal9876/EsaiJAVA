package exceptionhandling;

public class e1 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(7/0);//false
		}
		catch(Exception e){
			System.out.println("Error ");
		}
		finally {
			System.out.println("Always execute");
		}
	}

}
