package week1.Day4.employee;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;
	private AccountType acctType;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
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
	
	public double getBalance() {
		return balance;
	}
	
	public double computeInterest() {
		if(acctType==AccountType.CHECKING) {
			return balance * 0.02;
		}
		else if(acctType==AccountType.SAVINGS) {
			return balance *0.04;
		}
		else { // retirement account
			 return balance * 0.05;
		}
	}
}