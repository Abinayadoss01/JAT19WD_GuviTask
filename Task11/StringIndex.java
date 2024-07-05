package Task11;

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Abinaya";
		try {
		String Substring = a.substring(1,9);
		System.out.println(Substring);}
		
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
