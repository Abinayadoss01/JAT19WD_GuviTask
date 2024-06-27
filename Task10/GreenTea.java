package OopsConcepts;

public class GreenTea extends Tea {
	
	 public void Print() { 
		 System.out.println("Green tea"); 
		 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreenTea GT = new GreenTea();
		GT.Print();
		GT.PrepareTea("Hotwater", "GreenTeaLeaves");
	 
		
	}

}
