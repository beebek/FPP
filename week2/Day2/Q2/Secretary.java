package week2.Day2.Q2;

public class Secretary implements Employee {
	int nosHrPerMonth;
	int nosYrWork;
	String name;
	
	public Secretary() {
		nosHrPerMonth = 0;
		nosYrWork = 0;
		name = "";
	}

	public Secretary(String name, int nosHrPerMonth, int nosYrWork) {
		this.name = name;
		this.nosHrPerMonth = nosHrPerMonth;
		this.nosYrWork = nosYrWork;
	}

	public String getEmployeeDetails() {
		return "Secretary, " + name + " works for " + nosHrPerMonth + "hr/month. Worked for " + nosYrWork + " years.";
	}
	
	public double calculateSalary() {
		double salary = nosHrPerMonth * Employee.baseSalary;;
		if(nosYrWork > 5) {
			salary += salary * 0.1;
		}
		if(nosHrPerMonth > 150)
			salary += (nosHrPerMonth-150) * Employee.bonus;
		return salary;
	}

}
