package week2.Day2.Q2;

public interface Employee {
	public static final double baseSalary = 10; // attributes are public static final by default
	public static final int bonus = 2;
	public static final int extraHours = 15;
	
	public String getEmployeeDetails(); // methods are abstract by default
	public double calculateSalary();
}
