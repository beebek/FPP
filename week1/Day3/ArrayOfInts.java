package week1.Day3;

/*
 
	1)  Create a Java method
	
	static int min(int[] arrayOfInts)
	
	that outputs the minimum of an array of ints. Create a main method that tests your
	method on the following input array
	
	[-2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22]
	
	Test your method and make sure it works!
	
	2)  Do the same as above but instead of the minimum find the average of the numbers in the array.  
	Test it.
	
	4)  On page 99, there is table 3-8.  We will only use the top three rows.
     Create a two dimensional table with  3  rows and  6  columns.
     Put the data from the top 3 rows of table 3-8 into your table.

	a)	Print out the average of each row.
	b)	Print out the average of each column.


 */


public class ArrayOfInts {
	// Question 1
	public static int min(int[] arrayOfInts) {
		int minItem = arrayOfInts[0];
		for(int item: arrayOfInts) {
			if(minItem>item) {
				minItem = item;
			}
		}
		return minItem;
	}
	
	// Question 2
	public static float avg(int[] arrayOfInts) {
		float average = 0;
		for(int item: arrayOfInts) {
			average += item;
		}
		return average/arrayOfInts.length;
	}
	
	// Question 4.a
	public static void avgOfRow(float[][] arrayOfInts) {
		int lenCol = arrayOfInts[0].length;
		int lenRow = arrayOfInts.length;
		float sumOfRow = 0;
		for(int row=0; row<lenRow; row++) {
			for(int col=0; col<lenCol; col++) {
				sumOfRow += arrayOfInts[row][col];
			}
			System.out.format("Average of Row  %d: %.2f\n",row+1,sumOfRow/lenCol);
			sumOfRow= 0;
		}
	}
	
	// Question 4.b
	public static void avgOfCol(float[][] arrayOfInts) {
//		System.out.println("Row length: " + arrayOfInts.length);
//		System.out.println("Column length: " + arrayOfInts[0].length);
		
		int lenCol = arrayOfInts[0].length;
		int lenRow = arrayOfInts.length;
		float sumOfColumn = 0;
        for(int col = 0; col<lenCol; col++) {
            for(int row = 0; row<lenRow; row++) {
                sumOfColumn += arrayOfInts[row][col];
            }
            System.out.format("Average of Column  %d: %.2f\n",col+1,sumOfColumn/lenRow);
            sumOfColumn = 0;
        }
	}
	
	
	public static void main(String[] args) {
//		System.out.println("Minimum value: " + min(new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22}) );
		System.out.println("Minimum value: " + min(new int[]{1,-2,3,0}));
		System.out.println("Average value: " + avg(new int[]{1,2,3}));
		System.out.println("--------------------");
		
		float[][] table = new float [][] {{1,2,3},
										  {4,5,6},
										  {7,8,9},
										  {10,11,12}};
//		System.out.println("table: " + avgOfRow(table));
		avgOfRow(table);
		System.out.println("--------------------");
		avgOfCol(table);
	}

}
