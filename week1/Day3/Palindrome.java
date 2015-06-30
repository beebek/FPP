package week1.Day3;

/*

    Lesson 3 :  Fundamental Programming Structures  -  Part 2.

        Readings :  Parts of chapter 3.  Read the parts that you need in order to understand the lesson 
                                          and do the homework.

        Lab  :  

         1)  Write an application that determines if an input word is a palindrome.  A palindrome is a string 
               that reads the same forward and backward, for example, noon  and  madam.  
               Ignore the case of the letter.   (Definitely do for the midterm.)

 */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input word: ");
		String word = sc.nextLine();
		int wordLength = word.length();
		boolean palindrome = true;
		for(int i=0; i<wordLength/2; i++) {
			if(word.charAt(i) != word.charAt(wordLength-i-1)) {
				System.out.println("Not Palindrome !!!");
				palindrome = false;
				break;
			}
		}
		if(palindrome) {
			System.out.println("Palindrome !!!");
		}
	}

}
