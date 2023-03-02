
public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		System.out.println(x);
		
		String firstname = "Sanchita";
		System.out.println(firstname);
		
		
//		Arithmatic operations (+,-,%,*,/)
		int a = 12;
		int b = 2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a%b);
		System.out.println(a*b);
		System.out.println(a/b);
		Calculator(3,5);
		Calculator(3,2);
		Addition();
		AdditionB(2,2);
		int a1 = AdditionC(2,4);
		System.out.println(a1);

	}
	
	public static void Calculator(int a, int b){
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a%b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
	
//	types of functions
	
//	functions with parameter and with return type
	
	public static void Addition(){
		System.out.println(9+9);
	}
	public static void AdditionB(int x,int y){
		System.out.println(x+y);
	}
	public static int AdditionC(int x,int y){
		return x - y;
	}


}
