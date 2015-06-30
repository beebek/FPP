package week1.Day2;

/*

Write a program that asks the user to enter a String. The program then writes to console
all substrings of this String. (By "substring", we mean any sequence of characters that
occur consecutively and in the same order in the given String. Therefore, "erg" is a
substring of "energy", but "gre" and "eng" are not. Note that the empty string "" is
considered a substring of every string.)
Note: You will need to make sure that you do not output the same substring twice. For
instance, if the user types in "abbab", might accidentally output the String "ab" twice,
since it occurs in two places in this String.

*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SubStrings {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		List<String> temp = new ArrayList<String>();
		for(int i=len+1; i>0; i--) {
			for(int j=0; j<i; j++){
				if (!temp.contains(str.substring(j,len-i+j+1))) {
					System.out.printf("%d-%d [%s]",j, len-i+j+1, str.substring(j,len-i+j+1));
					System.out.println();
					temp.add(str.substring(j,len-i+j+1));
				}
			}
			temp.clear();
			System.out.println("=======");
		}
		
	}

}
