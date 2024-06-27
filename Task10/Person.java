package OopsConcepts;

public class Person {
	String Name="Abinaya";
	int Age;
	
	public Person(String n, int a) {
		Name=n;
		Age= a;
	}

	public String getName() {
		return Name;
		}
	public int getAge() {
		return Age;
		}
	
	public static void main(String[] args) {
		// Creating constructor
		
		
		Person per = new Person("Abinaya",20);
		
		
		System.out.println("Name is "+per.getName());
		System.out.println("Age is "+per.getAge());
		
		
	}

	

}
