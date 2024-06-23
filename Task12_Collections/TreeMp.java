package TreeMapSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class TreeMp {

	public static void main(String[] args) {
	TreeMap<Integer,String> Treemap1 = new TreeMap<>();
	Treemap1.put(1,"aaaa");
	Treemap1.put(2,"cccc");
	Treemap1.put(3,"bbbb");
	Treemap1.put(4,"dddd");
	Treemap1.put(5,"abbbb");
	System.out.println(Treemap1);
	//Sort names in alphabetical order
	List<String> emp = new ArrayList<>(Treemap1.values());
	Collections.sort(emp);
	 System.out.println(emp);
	}
	

}
