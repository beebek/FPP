package week1.Day3;

/*

2)  Prompt the user for a string.  Save it in a StringBuffer object.
    a)  Append  “bye”  to the above.  Print it out.
    b)  Make all lowercase letters uppercase, and uppercase letters lowercase.  Print the new string.
          (For lowercase you can use something like 
                               if  ((char1 >= ‘a’)  &&  (char1 <= ‘z’)) …
                        Also check out the Character class!)

 */

import java.util.Scanner;

public class StringBuff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userStr = sc.nextLine();
		StringBuffer strBuffer = new StringBuffer(userStr);
		strBuffer.append("bye");
		System.out.println("After appending : " + strBuffer);
		
		System.out.print("New String : ");
		for(int i=0; i<strBuffer.length(); i++) {
			if((int)strBuffer.charAt(i) >= (int)"a".charAt(0) && (int)strBuffer.charAt(i) <= (int)"z".charAt(0)) {
				System.out.print(Character.toUpperCase(strBuffer.charAt(i)));
			}
			else {
				System.out.print(Character.toLowerCase(strBuffer.charAt(i)));
			}
		}
	}

}
