package week1.Day2;

/*
  1)  Create a class Prog2. Inside its main method, create float variables to store each of the
  following numbers:    1.27, 3.881, 9.6
  Output to the console the following two values:
  a. the sum of the floats as an integer, obtained by casting the sum to type int
  b. the sum oAf the floats as an integer, obtained by rounding the sum to the nearest
  integer, using the Math.round function
*/

public class Prog2 {

	public static void main(String[] args) {
		float a = 1.27f, b = 3.881f, c = 9.6f;
		System.out.println("a. the sum of the floats as an integer, obtained by casting the sum to type int: " + (int) (a + b + c));
		System.out.println("b. the sum of the floats as an integer, obtained by rounding the sum to the nearest "
						   + "integer, using the Math.round function: " + Math.round(a + b + c));

	}

}
