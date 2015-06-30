package week1.Day4;

import java.util.List;
import java.util.ArrayList;

public class MyStringList {
	
	private String[] strArray;
	int size = 0;
	
	public MyStringList() {
		size = 0;
		strArray = new String[2];
	}
	
	public void add(String s) {
		// adds s to the end of the underlying array
		String[] tempArr = strArray;
		int count = 0;
		
		for(String item: strArray) {
			if(item!=(null))
				count++;
		}
		
		if(count==strArray.length) {
			resize();
		}
		
		int index = 0;
		for(index=0; index<tempArr.length; index++) {
			if(strArray[index]==null)
				break;
			strArray[index] = tempArr[index];
		}
		strArray[index] = s;
	}
	
	public void resize() {
		String[] tempStr = strArray;
		strArray = new String[strArray.length * 2];
		for(int i=0; i<tempStr.length; i++) {
			strArray[i] = tempStr[i];
		}
	}
	
	public void Display() {
		System.out.println("The string Array is " + String.join(",", strArray));
	}
	
	public String get(int i) {
		// retrieves the String at the ith position in the underlying array
		return strArray[i];
	}
	
	public boolean find(String s) {
		// returns true if String s is found in the array, false otherwise
		int i = 99;
		for(String str: strArray){
			if(str.equals(s))
				return true;
		}
		return false;
		
	}
	public boolean remove(String s)	{
		/**	removes first occurrence of  String s if it is found in the underlying array
			if found, returns true; if not found returns false
		*/
		if(!find(s))
			return false;
		
		int i = 0;
		for(i=0; i<strArray.length; i++) {
			if(strArray[i].equals(s))
				break;
		}
		
		String[] tempStrArray = strArray;
		for(int j=i; j<strArray.length; j++) {
			if(strArray[j]==null)
				break;
			strArray[j] = tempStrArray[j+1];
		}
		return true;
	}
	
	public String toString() {
		/** returns a String representation of the underlying array 
			here is a typical output:
			[Bob, Steve, Susan, Mark, Dave]
		*/
		String retString = "";
		for(int i=0; i<strArray.length; i++) {
			if(!(strArray[i]==null)){
				if(i>=0 && i+1<strArray.length && !(strArray[i+1]==null))
					retString += strArray[i] + ", ";
				else
					retString += strArray[i];
			}
		}
		return "[" + retString + "]";
	}
	
	
	public int size() {
		// returns the next open position in the underlying array – this is precisely the number of Strings that have been added minus the number of String that have been removed.
		int i = 0;
		for(i=0; i<strArray.length; i++) {
			if(strArray[i]==null)
				break;
		}
		return i;
	}
	
	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.Display();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.Display();
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
	}
}
