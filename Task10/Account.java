package OopsConcepts;

public class Account {
	 String accountNumber;
	 double balance;

	public Account(String accountNumber, double balance) {
	    this.accountNumber = accountNumber;
	    this.balance = balance;
	}
	
	public Account() {
		balance=55000;//Saving account balance
	}

	public void Withdraw(double amount) {
		if (balance >= amount) {
	        balance -= amount;
	        System.out.println("Balance after withdrawal: "+balance);
	    } else {
	        System.out.println("Insufficient balance");
	    }	
	}
	
	public void Deposit(double amount) {
		balance += amount;
		System.out.println("Balance after deposit: "+balance);
	}
	
	public double balance() {
		return balance;
	}
	
	public static void main(String[] args) {
		// Creating constructor with two arguments
		Account acc = new Account("BA123345", 138000);
		
		//Creating constructor without arguments
		Account acc1 = new Account();//Constructor overloading
		acc.Deposit(1000);
		acc.Withdraw(100);
		System.out.println("Saving account balance: "+acc1.balance());


		
		

	}

}



