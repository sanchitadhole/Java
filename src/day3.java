
public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		program 1  - charAt
		
		String city = "Ahmadnager";
		
		for(int i=0;i<city.length();i++){
			System.out.println(i);
			System.out.println(city.charAt(i));
		}
		
		String name = "Sanchita";
		char a = name.charAt(2);
		System.out.println(a);
		
		int len = name.length();
		System.out.println(len);
		for(int i=0;i<len;i++){
			System.out.println(name.charAt(i));
		}
		

//		program 2 - reverse string
		
		String Str = "nagar";
		String rev = "";
		for(int i=0;i<Str.length();i++){
			rev = Str.charAt(i)+rev;
			
		}
		System.out.println(rev);
		
//		2nd way
		
		String Str1 = "Sanchita";
		String rev2 = "";
		for(int i=Str1.length()-1;i>=0;i--){
			System.out.println(Str1.charAt(i));
			rev2 = rev2 + Str1.charAt(i);
		}
		System.out.println(rev2);
		
		
//		program 3 - contains
		
		String fruits = "Mang banana apple grapes";
		String userInput = "Mango";
		if(fruits.contains(userInput)){
			System.out.println("fruits available");
		}else{
			System.out.println("fruits not available");
		}
		
//		program 4 - count vowels
		
		String fullname = "Sanchitaoo";
		int count = 0;
		for(int i=0;i<fullname.length();i++){
			if(fullname.charAt(i)=='a'||fullname.charAt(i)=='e'||fullname.charAt(i)=='i'||fullname.charAt(i)=='o'||fullname.charAt(i)=='u'){
				count = count +1;
			}
		}
		System.out.println(count);
		
//		program 4 - substring
		
		String subject = "Javascript";
		String s = subject.substring(1,5);
		System.out.println(s);

	}

}
