package Switch;

public class Switch1 {
	public static void main (String[] args) {
		String fruits = "pineapple";
		switch(fruits)
		{
		case "orange":
		System.out.println("orange");
		break;
		
		case "pineapple":
			System.out.println("pineapple is here");
			break;
			
			default: 
				System.out.println("does not match");
				break;
		}
	}

}
