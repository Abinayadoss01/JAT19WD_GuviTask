package OopsConcepts;

public class herbalTea extends Tea {
	 public void Print() { 
		 System.out.println("Herbal tea"); 
		 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		herbalTea HT = new herbalTea();
		HT.Print();
		HT.PrepareTea("Hotwater", "Herbal tea Leaves");
		HT.addSugar();
	}

}
