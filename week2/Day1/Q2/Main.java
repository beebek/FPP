package week2.Day1.Q2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Professor p1 = new Professor("Lerman", 5000, "2015-01-01", 10);
		Professor p2 = new Professor("Rod", 6000, "2015-2-02", 10);
		Professor p3 = new Professor("Chris", 7000, "2015-3-03", 10);
		Secretary s1 = new Secretary("Radha", 500, "2015-04-01", 200);
		Secretary s2 = new Secretary("Sita", 1000, "2015-05-01", 200);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s1;
		department[4] = s2;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Press \"Y\" to see sum of all salaries: ");
		String wish = keyboard.nextLine();
		if(wish.equals("y")) {
			double salary = 0;
			for(DeptEmployee emp: department){
				salary += emp.salary;
			}
			System.out.println("The sum of salaries in the department is " + salary);
		}
		else
			System.out.println("Good Bye !!!");
		
		
	}
}

// Output

/*
	Press "Y" to see sum of all salaries: y
	The sum of salaries in the department is 19500.0
 */

