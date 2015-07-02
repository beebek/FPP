package week2.Day2.Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter details...\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Information for Secretary -");
		System.out.println("name: ");
		String name = sc.nextLine();
		System.out.println("no.s of hour per month: ");
		int nosHrPerMonth = sc.nextInt();
		System.out.println("no.s of years worked: ");
		int nosYrWork = sc.nextInt();
		Secretary secretary = new Secretary(name, nosHrPerMonth, nosYrWork);
		System.out.println(secretary.getEmployeeDetails());
		System.out.println("Secretary's salary is $" + secretary.calculateSalary());
		
		System.out.println();
		sc.nextLine();
		System.out.println("Information for Manager -");
		System.out.println("name: ");
		name = sc.nextLine();
		System.out.println("no.s of hour per month: ");
		nosHrPerMonth = sc.nextInt();
		System.out.println("no.s of years worked: ");
		nosYrWork = sc.nextInt();
		Manager manager = new Manager(name, nosHrPerMonth, nosYrWork);
		System.out.println(manager.getEmployeeDetails());
		System.out.println("Manager's salary is $" + secretary.calculateSalary());
		
		
		
	}

}
