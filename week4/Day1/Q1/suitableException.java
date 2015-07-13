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
