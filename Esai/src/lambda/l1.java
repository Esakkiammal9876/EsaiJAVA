package lambda;

public class l1 {
	
	public static void main(String[] args) {
		
		/*String a = "sudha";
		D1 d2 =()-> {        //lambda l = new lambda();
			System.out.println("Hello" + a );
			};
		d2.pt();*/
		
		
		//lambda expression with parameters
		/*D2 s1 = (side)->{ //lambda l = new lambda(side);
			System.out.println("Area of square " + (side*side));
		};
		s1.square(40);*/
		
		//lambda expression with two parameters
		D3 ad1 = (m,n)->(m+n);
		System.out.println(ad1.add(8, 9));
	}

}

