package OopsConcepts;

import java.util.ArrayList;
import java.util.List;

public class Tea {
String hotWater;
String teaLeaves;

	public void PrepareTea(String w,String l) {
		// prepare basic tea
		hotWater=w;
		teaLeaves=l;
		
		System.out.println("Tea is ready!! Ingredients are "+w +" and "+l);
	}
	public void addMilk() {
		// Adding Milk
		String m="milk";
		
		System.out.println("Milk is added"	);
	
	}
	public void addSugar() {
		// Adding Sugar
		String s="Sugar";
		System.out.println("Sugar is added"	);
		
	}
	void Print() {
		// TODO Auto-generated method stub
		System.out.println("Tea");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> Tea=new ArrayList<String>();
//		Tea.add("hotwater");
//		Tea.add("teaLeaves"); 
		//System.out.println("Basic Tea : " + Tea.toString()); 
		Tea t= new Tea();
		t.PrepareTea("Hotwater", "Plain tea leaves");
		t.addMilk();
		t.addSugar();
		Tea a = new GreenTea();
        a.Print();
		
	}
	
}
