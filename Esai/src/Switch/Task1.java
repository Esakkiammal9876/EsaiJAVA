package Switch;

public class Task1 {
	
	public static void main(String[] args) {
		int choice = 1 ;
		switch(choice) {
		
		case 1:
			int R=5;
			float pi=3.14f;
			System.out.println("Area of circle is " + pi*R*R);
		break;
		
		case 2:
			int L=5;
			int B=10;
			System.out.println("Area of rectangle is " + L*B);
			break;
			
			default:
				System.out.println("does not match");
				break;
	}

	}
}
