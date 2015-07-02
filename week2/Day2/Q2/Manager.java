package week2.Day2.Q2;

public class Manager implements Employee {
	int nosHrPerMonth;
	int nosYrWork;
	String name;
	
	public Manager() {
		nosHrPerMonth = 0;
		nosYrWork = 0;
		name = "";
	}

	public Manager( String name, int nosHrPerMonth, int nosYrWork) {
		this.name = name;
		this.nosHrPerMonth = nosHrPerMonth;
		this.nosYrWork = nosYrWork;
	}

	public String getEmployeeDetails() {
		return "Manager, " + name + " works for " + nosHrPerMonth + "hr/month. Worked for " + nosYrWork + " years.";
	}
	
	public double calculateSalary() {
		double salary = Employee.baseSalary * 2 * nosHrPerMonth;
		if(nosHrPerMonth > 150)
			salary += (nosHrPerMonth-150) * Employee.extraHours;
		return salary;
	}
}

// Output

/*	
 	Enter details...
	
	Information for Secretary -
	name: 
	Rita
	no.s of hour per month: 
	240
	no.s of years worked: 
	10
	Secretary, Rita works for 240hr/month. Worked for 10 years.
	Secretary's salary is $2820.0
	
	Information for Manager -
	name: 
	John Right
	no.s of hour per month: 
	280
	no.s of years worked: 
	17
	Manager, John Right works for 280hr/month. Worked for 17 years.
	Manager's salary is $2820.0
*/