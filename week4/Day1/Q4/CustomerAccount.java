package week4.Day1.Q4;

public class CustomerAccount {
	String Cus_name;
	String Acc_No;
	double Balance;
	
	public CustomerAccount(String cus_name, String acc_No, double balance) {
		Cus_name = cus_name;
		Acc_No = acc_No;
		Balance = balance;
	}

	public double getBalance() {
		return Balance;
	}


	public void deposit(double amt) {
		Balance += amt;
	}
	
	public void Withdraw(double amt) throws IllegalArgumentException{
		if(amt>Balance)
			throw new IllegalArgumentException("Your withdraw amount exceed the balance !!!");
		if(Balance-amt<100)
			throw new IllegalArgumentException("Balance will reach below $100 !!!");
		Balance -= amt;
	}
	
	public static void main(String[] args) {
		CustomerAccount customer = new CustomerAccount("Bibek", "982525", 500);
		try {
			customer.deposit(50);
			System.out.println("Balance : $" + customer.getBalance());
			System.out.println("Withdrawing $400...");
			customer.Withdraw(400);
			System.out.println("Balance : $" + customer.getBalance());
			System.out.println("Withdrawing $100...");
			customer.Withdraw(100);
			
//			System.out.println("Withdrawing $600");
//			customer.Withdraw(600);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

// Output

/*
	Balance : $550.0
	Withdrawing $400...
	Balance : $150.0
	Withdrawing $100...
	Balance will reach below $100 !!!
	
	Withdrawing $600
	Your withdraw amount exceed the balance !!!
*/
