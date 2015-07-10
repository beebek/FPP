package week3.Day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Marketing {
	String employeeName;
	String productName;
	double salesAmount;

	public Marketing(String employeeName, String productName, double salesAmount) {
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public String getProductName() {
		return productName;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	
	@Override
	public String toString() {
		return "employeeName=" + employeeName + ", productName="
				+ productName + ", salesAmount=" + salesAmount;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Marketing> empArray = new ArrayList <Marketing>();
		Marketing m1 = new Marketing("Mohan", "Pressure Cooker", 25);
		Marketing m2 = new Marketing("Hari", "Laptop", 599);
		Marketing m3 = new Marketing("John", "Mouse", 7);
		Marketing m4 = new Marketing("Sita", "Pendrive", 5);
		empArray.add(m1);
		empArray.add(m2);
		empArray.add(m3);
		empArray.add(m4);
		System.out.println("*** Before Removing item ***");
		for(Marketing item: empArray) {
			System.out.println(item);
		}
		
		System.out.println("\n*** After removing item ***");
		empArray.remove(3);
		for(Marketing item: empArray) {
			System.out.println(item);
		}
		
		System.out.println("\n*** After modifying objects ***");
		empArray.set(2, new Marketing("Rambo", "Toys", 75));
		for(Marketing item: empArray) {
			System.out.println(item);
		}
		
		// using comparator
		CompEmployeeName compEmpName = new CompEmployeeName();
		Collections.sort(empArray, compEmpName);
		System.out.println("\nAfter sorting by Employee name...");
		for(Marketing item: empArray) {
			System.out.println(item);
		}
		
		CompSalesAmount compSalesAmt = new CompSalesAmount();
		Collections.sort(empArray, compSalesAmt);
		System.out.println("\nAfter sorting by Sales Amount...");
		for(Marketing item: empArray) {
			System.out.println(item);
		}
	}
}

class CompEmployeeName implements Comparator<Marketing> {
	@Override
	public int compare(Marketing m1, Marketing m2) {
		return m1.getEmployeeName().compareTo(m2.getEmployeeName());
	}
	
}

class CompSalesAmount implements Comparator<Marketing> {
	@Override
	public int compare(Marketing s1, Marketing s2) {
		return (int)s1.getSalesAmount() - (int)s2.getSalesAmount();
	}
}

// Output

/*
	*** Before Removing item ***
	employeeName=Mohan, productName=Pressure Cooker, salesAmount=25.0
	employeeName=Hari, productName=Laptop, salesAmount=599.0
	employeeName=John, productName=Mouse, salesAmount=7.0
	employeeName=Sita, productName=Pendrive, salesAmount=5.0
	
	*** After removing item ***
	employeeName=Mohan, productName=Pressure Cooker, salesAmount=25.0
	employeeName=Hari, productName=Laptop, salesAmount=599.0
	employeeName=John, productName=Mouse, salesAmount=7.0
	
	*** After modifying objects ***
	employeeName=Mohan, productName=Pressure Cooker, salesAmount=25.0
	employeeName=Hari, productName=Laptop, salesAmount=599.0
	employeeName=Rambo, productName=Toys, salesAmount=75.0
	
	After sorting by Employee name...
	employeeName=Hari, productName=Laptop, salesAmount=599.0
	employeeName=Mohan, productName=Pressure Cooker, salesAmount=25.0
	employeeName=Rambo, productName=Toys, salesAmount=75.0
	
	After sorting by Sales Amount...
	employeeName=Mohan, productName=Pressure Cooker, salesAmount=25.0
	employeeName=Rambo, productName=Toys, salesAmount=75.0
	employeeName=Hari, productName=Laptop, salesAmount=599.0
*/
