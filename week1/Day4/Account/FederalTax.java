package week1.Day4.Account;

/*

	Programming Assignment 4-1
	
	DO FIRST :
	
	The Employee class from the lecture is given below.  Use that class and add a method to it called  
	yearlyFederalTax  which computes the yearly federal tax on the salary.
	
	The first line looks like   double  yearlyFederalTax ()
	
	Write the method.  
	
	 If the salary is greater than $80,000 then the tax is 28% of the salary.
	 If the salary is greater than $50,000 and  <=  $80,000  then the tax is 24% of the salary.
	 If the salary is greater than $26,000  and  <=  $50,000  then the tax is 20% of the salary.
	 If the salary is  <=  $26,000  then there is no tax.
	
	 Test your numbers Very Thoroughly!

 */


public class FederalTax {
	public double yearlyFederalTax (double salary)
	{
		if (salary<=26000) {
			return 0;
		}
		else if (salary>26000 && salary<=50000) {
			return (salary * 20/100);
		}
		else if (salary>50000 && salary <=80000) {
			return (salary * 24/100);
		}
		else { // salary greater than $80,000
			return (salary * 28/100);
		}
	}
	
	public static void main(String[] args) {
		FederalTax acc = new FederalTax();
		double salary = 50000;
	    System.out.printf("The yearly federal tax on the salary is $%.2f", acc.yearlyFederalTax(salary));
	}

}
