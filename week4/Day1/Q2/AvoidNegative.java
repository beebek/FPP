package week4.Day1.Q2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AvoidNegative {
	
	public static void main(String[] args) {
		System.out.println("Enter mark in range 0 to 100...");
		System.out.println("Marks: ");
		try {
			Scanner sc = new Scanner(System.in);
			int mark = sc.nextInt();
			if(mark<0 || mark>100)
				throw new Exception("Number Out of Range");
			System.out.print("Your mark is " + mark);
		}
		catch(InputMismatchException e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
		catch(Exception e){
			System.out.println("Exception occurred: " + e.getMessage());
		}
		
	}

}
