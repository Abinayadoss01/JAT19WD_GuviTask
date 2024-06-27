package OopsConcepts;

public class Employee {
	int Salary=12000;
	int ID=12;
	String FirstName = "Abinaya";
	String Lastname = "Shankar";
	public int getID() {
		return ID;}
	public String getFirstname() {
		return FirstName;
		}
	
	public String getLastname() {
		return Lastname;
		}
	public String getName() {
		String Name= FirstName+Lastname;
		return Name;
		}
	public int getSalary() {
		return Salary;
		}
	
	public int getAnnualSalary() {
		int annual=Salary*12;
		return annual;
		}
	public int RaiseSalary() {
		int Percentage=60;
		int c=(Salary*Percentage/100)+Salary;
		return c;}

	

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		
		
		System.out.println("ID: "+emp.getID());
		System.out.println("Firstname: "+emp.getFirstname());
		System.out.println("Lastname: "+emp.getLastname());
		System.out.println("Fullname: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Annual Salary: "+emp.getAnnualSalary());
		System.out.println("Salary after yearly raise: "+emp.RaiseSalary());
		
	}

}
