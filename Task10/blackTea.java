package OopsConcepts;

public class blackTea extends Tea {
	 public void Print() { 
		 System.out.println("black tea"); 
		 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blackTea BT = new blackTea();
		BT.Print();
		BT.PrepareTea("Hotwater", "Black tea Leaves");
		BT.addSugar();
	}

}
