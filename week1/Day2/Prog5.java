package week1.Day2;

/*
 2)  a)  Write a program (called Prog5) that asks the user to input a String. The output is the
       characters of this String in reverse order. (For example, if the input string is "Hello", the
       output string would be "olleH".) (Do not use arrays and do not create a new String
       object.)  (Definitely do for the midterm.)

      b)  Output the number of  ‘x’s  in the string from the user.
            For example if the user types in  “Exit  abc  exit”, 
            then the output would be  “2  ‘x’ characters”
*/

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input a String: ");
		String inputString = sc.nextLine();
		for(int i=inputString.length()-1; i>=0; i--) {
			System.out.print(inputString.charAt(i));
		}
		
		System.out.println("\n===========");
		int count = 0;
		for(int i=0; i<inputString.length(); i++) {
			if(inputString.charAt(i)=='x') {
				count++;
			}
		}
		System.out.printf("%d 'x' characters",count);
	}

}
