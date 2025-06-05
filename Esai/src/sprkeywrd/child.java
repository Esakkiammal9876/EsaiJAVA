package sprkeywrd;

public class child extends parent {
	int age = 40;
	public static void main(String[] args) {
		child c = new child();
		c.display();
	}
	
	public void display() {
		
		System.out.println(super.age); //parent print statement
		System.out.println(age);
		
	}

}
