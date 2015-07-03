package week2.Day4;

public class CurrencyConverter {
	static double nrs;
	
	public CurrencyConverter(double nrs) {
		this.nrs = nrs;
	}
	
	static class Inner {
		static double toUSD() {
			return nrs/101.63;
		}
	}
	
	void dispalyUSD() {
		System.out.printf("Rs%.2f/- is $%.2f", nrs, Inner.toUSD());
	}
	
	public static void main(String[] args) {
		CurrencyConverter nrs = new CurrencyConverter(120000);
		nrs.dispalyUSD();
	}
}

// Output

/*
	Rs120000.00/- is $1180.75
*/
