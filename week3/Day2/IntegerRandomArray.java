package week3.Day2;

import java.util.Arrays;
import java.util.Random;

public class IntegerRandomArray {
	int[] numArray;
	int size;
	
	public IntegerRandomArray() {
		numArray = new int[10];
		size = 0;
	}

	public IntegerRandomArray(int[] numArray) {
		this.numArray = numArray;
	}
	
	public void add(int num) {
		if(size>=numArray.length)
			resize();
		numArray[size] = num;
		size++;
	}
	
	public void removeDuplicate() {
		int[] tempArray = new int[this.numArray.length];
		int index=0;
		for(int i=0; i<numArray.length; i++) {
			boolean duplicate = false;
			for(int j=0; j<numArray.length; j++) {
				if(this.numArray[i]==tempArray[j]) {
					duplicate = true;
					break;
				}
			}
			if(!duplicate) {
				tempArray[index]=this.numArray[i];
				index++;
			}
		}
		this.numArray = tempArray;
	}
	
	public void resize() {
		System.out.println("Calling resizing...");
		int newSize = numArray.length * 2;
		int[] temp = new int[newSize];
		for(int i=0; i<numArray.length; i++) {
			temp[i] = numArray[i];
		}
//		System.arraycopy(numArray, 0, temp, 0, numArray.length);
		numArray = temp;
	}
	
	public void removeAll() {
		numArray = new int[size];
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int getElement(int index) {
		return numArray[index];
	}
	
	public int[] getSubList(int start, int end) {
		int[] temp = new int[end-start+1];
		for(int i=start, j=0; i<=end; i++, j++)
			temp[j] = numArray[i];
		return temp;
	}
	
	public void sort() {
		Arrays.sort(numArray);
	}

	@Override
	public String toString() {
		return "numArray = " + Arrays.toString(numArray);
	}

	public static void main(String[] args) {
		IntegerRandomArray array = new IntegerRandomArray();
		
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			array.add(rand.nextInt(100));
		}
		System.out.println(array);
		
		array.add(22);
		array.add(22);
		System.out.println("After adding 22 two times...");
		System.out.println(array);
		
		System.out.println("After removing duplicates...");
		array.removeDuplicate();
		System.out.println(array);
		
		System.out.println("After removing all elements...");
		array.removeAll();
		System.out.println(array);
		
		System.out.println("Adding elements...");
		for(int i=0; i<10; i++) {
			array.add(rand.nextInt(100));
		}
		System.out.println(array);
		System.out.println("Getting element 14...");
		System.out.println(array.getElement(14));
		
		System.out.println("Getting substring...");
		System.out.println(Arrays.toString(array.getSubList(12, 14)));
		
		System.out.println("Sorting array...");
		array.sort();
		System.out.println(array);
	}
}

// Output

/*
	numArray = [0, 83, 57, 60, 70, 86, 54, 86, 4, 27]
	Calling resizing...
	After adding 22 two times...
	numArray = [0, 83, 57, 60, 70, 86, 54, 86, 4, 27, 22, 22, 0, 0, 0, 0, 0, 0, 0, 0]
	After removing duplicates...
	numArray = [83, 57, 60, 70, 86, 54, 4, 27, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	After removing all elements...
	numArray = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	Adding elements...
	Calling resizing...
	numArray = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 77, 94, 58, 60, 1, 22, 4, 83, 61, 88, 0, 0]
	Getting element 14...
	58
	Getting substring...
	[77, 94, 58]
	Sorting array...
	before removig duplicate
	numArray = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 77, 94, 58, 60, 1, 22, 4, 83, 61, 88, 0, 0]
	After removing duplicate
	numArray = [77, 94, 58, 60, 1, 22, 4, 83, 61, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	numArray = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 22, 58, 60, 61, 77, 83, 88, 94]
*/