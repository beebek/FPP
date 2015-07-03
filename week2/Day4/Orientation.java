package week2.Day4;

public class Orientation {
	int[] intArray;
	
	public Orientation(int[] intArray) {
		this.intArray = intArray;
	}
	
	public void checkArray() {
		class Determine {
			public String findType(){
				if(intArray.length/2==0)
					return "The array is even oriented.";
				return "The array is odd oriented.";
			}
		}
		Determine det = new Determine();
		System.out.println(det.findType());
	}

	public static void main(String[] args) {
		Orientation ornt = new Orientation(new int[]{10, 15, 20, 30, 5});
		ornt.checkArray();
	}
}

//Output

/*
	The array is odd oriented.
*/

