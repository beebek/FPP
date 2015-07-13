package week4.Day1.Q2;

import java.util.Scanner;

public class AvoidNegative {
	
	static int getMark() throws Exception {
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		return mark;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter mark in range 0 to 100...");
		System.out.println("Marks: ");
		int mark = getMark();
		System.out.println("Your mark is " + mark);
		
	}

}
