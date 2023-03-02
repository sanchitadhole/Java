
public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname = "I learn everything";
		System.out.println(firstname);


				// String +  Integer =====> String 
				// Integer + String  =====> String 
				// String  + String  =====> String 
				// Integer + Integer ====> Integer
		
		System.out.println("sanchita"+8);
		System.out.println(9+"dhole");
		System.out.println("sanchita"+"dhole");
		System.out.println(9+8);
		
//		methods
		
//		length
		String name = "sanchita";
		int s1  = name.length();
		System.out.println(s1);
		
		
//		concate
		String firstName1 = "sanchita ";
		String lastname1 = "Dhole";
		String s2 = firstName1.concat(lastname1);
		System.out.println(s2);
		
		System.out.println(firstName1 + lastname1);
		
		String city = new String("sangamner");
		System.out.println(city);
		
//		toUpperCase
		
		String city2 = "Nagpur";
		String s3 = city2.toUpperCase();
		System.out.println(s3);
		
//		toLowerCas
		
		String city3 = "Pune";
		city3.toUpperCase().toLowerCase().length();
		
		String city4 = "Pune";
		String city5 = "pune";
		String city6 = "mumbai";
		
//		equals
		
		System.out.println(city4.equals(city5));
		System.out.println(city4.equals(city6));
		
		
//		program 1
		
		if(city4.equals(city5)){
			System.out.println("same city");
		}else{
			System.out.println("different city");
		}
		
//		program 2
		
		if(city4.equalsIgnoreCase(city5)){
			System.out.println("same city");
		}else{
				System.out.println("different city");
		}
		
		
//		USING ternary operator
		
		String a = city4.equals(city5)?"equal":"not equal";
		System.out.println(a);
		
//		startsWith
		
		String start = "Ahmadnaer";
		boolean c = start.startsWith("A");
		System.out.println(c);
		
//		endsWith
		
		String end = "Ahmadnar";
		boolean d = end.endsWith("ar");
		System.out.println(d);
		
		
	}

}
