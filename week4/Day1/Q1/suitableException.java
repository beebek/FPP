package week4.Day1.Q1;

public class suitableException {
	
	static void calculate() {
		int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denum[] = {2, 0, 4, 4, 0, 8};
		
		for(int den: denum) {
			for(int nume: numer) {
				try {
					System.out.println(nume + "/" + den + " = " + nume/den);
				}
				catch (ArithmeticException e) {
					System.out.println(e);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		calculate();
	}
}

// Output

/*
	4/2 = 2
	8/2 = 4
	16/2 = 8
	32/2 = 16
	64/2 = 32
	128/2 = 64
	256/2 = 128
	512/2 = 256
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	4/4 = 1
	8/4 = 2
	16/4 = 4
	32/4 = 8
	64/4 = 16
	128/4 = 32
	256/4 = 64
	512/4 = 128
	4/4 = 1
	8/4 = 2
	16/4 = 4
	32/4 = 8
	64/4 = 16
	128/4 = 32
	256/4 = 64
	512/4 = 128
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	java.lang.ArithmeticException: / by zero
	4/8 = 0
	8/8 = 1
	16/8 = 2
	32/8 = 4
	64/8 = 8
	128/8 = 16
	256/8 = 32
*/
