package week4.Day1.Q2;

import java.util.Scanner;

public class AvoidNegative {
	
	static int getMark() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		if(mark<0 || mark>100)
			throw new Exception("Number Out of Range");
		return mark;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter mark in range 0 to 100...");
		System.out.println("Marks: ");
		try {
			int mark = getMark();
			System.out.print("Your mark is " + mark);
		}
		catch(Exception e){
			System.out.println("Exception occurred: " + e);
		}
		
	}

}
