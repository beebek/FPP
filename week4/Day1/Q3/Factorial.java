package week4.Day1.Q3;

import java.util.Scanner;

public class Factorial {
	public static long calculate(int n) throws IllegalArgumentException {
		if(n<0)
			throw new IllegalArgumentException("Exception... Entered value less than 0 !!!");
		else if(n>50)
			throw new IllegalArgumentException("Exception... Entered value larger than 50 !!!");
			
		if(n==0 || n==1) 
			return 1;
		return n* calculate(n-1);
		
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Enter no. in range 0-50 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println("factorial of " + num + " = " + calculate(num));
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

// Output

/*
	Enter no. in range 0-50 : 
	3
	factorial of 3 = 6
	
	Enter no. in range 0-50 : 
	-1
	Exception... Entered value less than 0 !!!
	
	Enter no. in range 0-50 : 
	53
	Exception... Entered value larger than 50 !!!
*/

