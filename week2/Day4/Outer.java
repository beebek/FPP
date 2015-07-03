package week2.Day4;

public class Outer {
	private int[] intArray;
	Inner innerObj = new Inner();
	
	public Outer() {
		intArray = new int[]{};
	}
	
	public Outer(int[] intArray) {
		this.intArray = intArray;
	}

	public int[] getIntArray() {
		return intArray;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}

	class Inner { 
		private double min() {
			int minVal = intArray[0];
			for(int item: intArray) {
				if(minVal>item)
					minVal = item;
			}
			return minVal;
		}
		
		private double max() {
			int maxVal = intArray[0];
			for(int item: intArray) {
				if(maxVal<item)
					maxVal = item;
			}
			return maxVal;
		}
		
		private double avg() {
			double avgVal = 0;
			for(int item: intArray)
				avgVal += item;
			return avgVal/intArray.length;
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.setIntArray(new int[]{1,2,3,4});
		System.out.println("min. value is " + outer.innerObj.min());
		System.out.println("max. value is " + outer.innerObj.max());
		System.out.println("avg. value is " + outer.innerObj.avg());
	}

}

// Output

/*
	min. value is 1.0
	max. value is 4.0
	avg. value is 2.5
*/

