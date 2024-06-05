package Samplepackage;

public class Calculator {

	public void Addition() {
		// TODO Auto-generated constructor stub
		int a=30;
		int b=50;
		int c=10;
		int d=10;
		
		int Sum1=a+b;
		int Sum2=c+d;
		
		if (Sum1 >Sum2) {
			System.out.println("Sum of A and B is greater than Sum of C and D and the value is :"+Sum1);
		}
			else {
				System.out.println("Sum of c and d is greater than Sum of A and B and the value is "+Sum2);
			}
		
	}
	
	public void Even(){
		int A1 = 32;
		int even =A1 % 2;
		
		if (even == 0) {
				
		System.out.println("The Value '" +A1 +"' is an even number");
		
	}
		else {
			System.out.println("The Value '" +A1 +"' is not an even number");
			}
		}

	public void senior(){
		int Age = 88;
		
		
		if (Age>60) {
				
		System.out.println("The person Age is '" +Age +"' and He is Senior citizen");
		
	}
		else {
			System.out.println("The Person age is  '" +Age +"' He is not Senior citizen");
			}
		}
	public void factorial(){
		int A1=1;
		int i;
		for(i=1;i<=4;i++) {
			
		A1=A1*i;
		}	
		System.out.println("The factorial Value of a 4 is " +A1);
		
		
	
		}
	
	public void Alphabets() {
		char C;
		for(C='A';C<='Z'; C++)
			System.out.print(C +" ");
	}
	
	public void Swap() {
		int num1=2;
		int num2=3;
		System.out.println(num1);
		System.out.println(num2);
		int swap=num1;
		num1=num2;
		num2=swap;

		
		System.out.println("Swapping of two numbers is" );
		System.out.println(num1);
		System.out.println(num2);
	}
	public void lengthofastring() {
		String A="Guvi geek";
		System.out.println("Length of a string '"+A + "' is "+A.length());
	}
	public void print() {
		String A="Welcome to Guvi geek";
		for(int i=0;i<=10;i++) {
		System.out.println(i+ "."+A );
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		//obj.Addition();
		//obj.Even();
		//obj.Alphabets();
		//obj.Swap();
		//obj.prime();
		//obj.factorial();
		//obj.lengthofastring();
		//obj.print();
		obj.senior();
	}

}
