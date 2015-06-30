package week1.Day3;

public class Star {
	
	public static void leftJustified(int n) {
		for(int i = 0; i < n; ++i){
			for(int j = 0; j <=i; ++j){
				if(j==0 || j==i || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	public static void rightJustified(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++){
				if(i==n-1 || j==n-i-1 || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void isosceles(int n) {
		for(int i = 0; i < n/2 + 1; i++) {
			for(int j = 0; j < n; j++){
				if((j==n/2 && i==0) || i==n/2-j || j==i+3 || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
			
	public static void main(String[] args) {
		Star.leftJustified(11);
		System.out.println("\n==================");
		Star.rightJustified(10);
		System.out.println("\n==================");
		Star.isosceles(5);
	}
}
