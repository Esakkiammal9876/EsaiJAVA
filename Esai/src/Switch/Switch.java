 package Switch;

public class Switch {
	
	public static void main(String[] args) {
		
		int age = 5;
		switch(age) {
		
		case 0:
		System.out.println("not born");
		break;
		
		case 1:
			System.out.println("new born");
		break;
		
		case 3:
			System.out.println("lKG");
		break;
		
		case 4:
			System.out.println("UKG");
		break;
		
		case 5:
			System.out.println("First standard");
		break;
		
		
		case 6:
			System.out.println("2nd");
			break;
			
		case 7:
			System.out.println("3rd");
			break;
			
			default:
				System.out.println("does not match");
				break;
		}
		
		
	}

}
