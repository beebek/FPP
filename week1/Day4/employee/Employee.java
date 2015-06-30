package week1.Day4.employee;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;
	AccountType acctType;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = 
		new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}
	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}
	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIRMENT, startAmount);
		
	}

	public void deposit(AccountType acctType, double amt){
		double balance;
		if(acctType==AccountType.CHECKING){
			balance = checkingAcct.getBalance() + amt;
		}
		else if(acctType==AccountType.SAVINGS) {
			balance = savingsAcct.getBalance() + amt;
		}
//		else if(acctType==AccountType.RETIRMENT) {
		else {
			balance = retirementAcct.getBalance() + amt;
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		double balance;
		if(acctType==AccountType.CHECKING){
			balance = checkingAcct.getBalance() - amt;
		}
		else if(acctType==AccountType.SAVINGS) {
			balance = savingsAcct.getBalance() - amt;
		}
//		else if(acctType==AccountType.RETIRMENT) {
		else {
			balance = retirementAcct.getBalance() - amt;
		}
		return true;
	}

	public String getFormattedAcctInfo() {
		// implement
		return null;
	}

}
