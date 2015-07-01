package week2.Day2.Q1;

import java.util.Scanner;

public class UseInsurance {
	public static void main(String[] args) {
		System.out.println("Type h or l for query...");
		System.out.println("h -> Health Insurance, l -> Life Insurance");
		System.out.print("Select type of Insurance: ");
		
		Scanner sc = new Scanner(System.in);
		String option = sc.nextLine();
		if(option.equals("h")) {
			Health h = new Health("health");
			h.setCost();
			h.display();
		}
		else if (option.equals("l")) {
			Life l = new Life("life");
			l.setCost();
			l.display();
		}
	}
}
