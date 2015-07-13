package week3.Day6;

import java.util.Arrays;
import java.util.HashMap;

public class Course {
	String c_name;
	String[] faculty;
	
	public Course(String c_name, String[] faculty) {
		this.c_name = c_name;
		this.faculty = faculty;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String[] getFaculty() {
		return faculty;
	}

	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}
	
	@Override
	public String toString() {
		return "Course [c_name=" + c_name + ", faculty="
				+ Arrays.toString(faculty) + "]";
	}

	public static void main(String[] args) {
		HashMap<String, Course> CS390 = new HashMap<String, Course>();
		CS390.put("1", new Course("FPP", new String[] {"Renuka", "Lerman", "Bahadur"}));
		CS390.put("2", new Course("MPP", new String[] {"Corazza", "Lerman"}));
		CS390.put("3", new Course("SCI", new String[] {"Divoky", "Edward"}));
		
		System.out.println("Retrieving only keys...");
		for (String key : CS390.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("Retrieving only values...");
		for (Course value : CS390.values()) {
			System.out.println(value);
		}
		
		System.out.println("All values in HashMap Collection...");
		System.out.println(CS390);
	}
}

// Output

/*
	Retrieving only keys...
	1
	2
	3
	Retrieving only values...
	Course [c_name=FPP, faculty=[Renuka, Lerman, Bahadur]]
	Course [c_name=MPP, faculty=[Corazza, Lerman]]
	Course [c_name=SCI, faculty=[Divoky, Edward]]
	All values in HashMap Collection...
	{1=Course [c_name=FPP, faculty=[Renuka, Lerman, Bahadur]], 
	 2=Course [c_name=MPP, faculty=[Corazza, Lerman]], 
	 3=Course [c_name=SCI, faculty=[Divoky, Edward]]}
*/

