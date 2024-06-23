package ArrayListSample;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		
		ArrayList<String> Arr1 = new ArrayList<String>();
		Arr1.add("Abinaya");
		Arr1.add("Pavish");
		Arr1.add("Shan");
		System.out.println("Names in the ArrayList:"+Arr1);
		Arr1.remove(0);
		System.out.println("Names in the ArrayList after removing index 0:"+Arr1);
		Arr1.removeAll(Arr1);
		System.out.println("Names in the ArrayList after removing all names:"+Arr1);
		Arr1.add("Pavishnav");
		System.out.println("Names in the ArrayList:"+Arr1);
	}

}
