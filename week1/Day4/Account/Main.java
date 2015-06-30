package week1.Day4.Account;

/*
 
4. Create a class Main having a main method that does the following:
     a. It creates a new Employee object employee (you can invent your own
         arguments for the constructor)
     b. Then it creates a checking account, savings account and retirement account for
    employee, each with a starting balance of $300.
     c. Then it prints to the console the account data for each of these accounts (making
         use of the toString() method that has been provided in Account)

5. Correct the implementation of getHireDay() in Employee, as discussed in the lecture.
    (Use a  GregorianCalendar  object to hold the data.)
 
 */


public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Lerman", 5000, 1991, 1, 1);
		Account acctChk = new Account(emp, "checking", 300);
		Account acctSav = new Account(emp, "savings", 300);
		Account acctRet = new Account(emp, "retirment", 300);
		System.out.println(acctChk.toString());
		System.out.println(acctSav.toString());
		System.out.println(acctRet.toString());
		System.out.println(emp.getHireDay());
	}

}
