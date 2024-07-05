package Task11;

public class ArithematicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		int b=0;
		try
		{
			int c=a/b;

			System.out.println(c);}
		catch (ArithmeticException e) {
		System.out.println("Divde by zero is not possible");
		}
		
		
		
	}

}
