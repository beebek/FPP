package week1.Day4.Account;

class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;

	Account(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		//updates the balance field
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		//updates the balance field and returns true, unless
		//withdrawal amount is too large; in that case,
		//it does not modify the balance field, and returns false
		if(amount>balance){
			return false;
		}
		balance -= amount;
		return true;
	}
	
	public String getAcctType() {
		return acctType;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double computeInterest() {
		if(acctType==CHECKING) {
			return balance * 0.02;
		}
		else if(acctType==SAVINGS) {
			return balance *0.04;
		}
		else { // retirement account
			 return balance * 0.05;
		}
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Sanjit",  5000, 2011, 1, 1);
		Account acct1 = new Account(emp1, SAVINGS, 10000);
		acct1.makeDeposit(2000);
		System.out.println("After $2000 deposit");
		System.out.printf("Get balance: $%.2f",acct1.getBalance());
		acct1.makeWithdrawal(7000);
		System.out.println("\nAfter $5000 withdraw");
		System.out.printf("Get balance: $%.2f",acct1.getBalance());
		System.out.print("\nWithdrawing $20000, ");
		System.out.println(acct1.makeWithdrawal(20000));
		System.out.printf("Get balance: $%.2f",acct1.getBalance());
	}
}