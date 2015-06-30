package week1.Day5;

/*		
   		Programming Assignment 6-1
		
		For this exercise, you will write your own exponential function. 
		Use the fact that for any (real number) x and any natural number n > 0, 
		
		xn = x * xn-1
		
		to write a recursive method 
		
		double power(double x,int n)
		
		that returns xn and that uses only multiplication (and addition and subtraction 
		if necessary) for its computation. (For this exercise, do not use the Math function 
		pow(x,n).) Enclose your method in a class called Exponential.
		
		Demonstrate that your method works by doing the following: In the main method, 
		create an instance of Exponential, and, from this instance, call power(2,10), and 
		print the result to the console.
 */



public class Exponential {
	public static double power(double x, int n) {
		// xn = x * xn-1
		if(n==0)
			return 1;
		return x * power(x, n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(power(2,10));
	}

}
