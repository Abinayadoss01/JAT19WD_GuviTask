package Task11;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = new int[2];
		
		try
		{
			number[3] = 55/2;

			//System.out.println(number[3]);
			}
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Operation out of array is not possible and the message: "+ e.getMessage());
		}
	}
	

}
