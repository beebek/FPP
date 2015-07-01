package week2.Day1.Q2;

public class Professor extends DeptEmployee {
	int numberOfPublications;
	
	public Professor(String name, double salary, String hireDate, int numberOfPublications) {
		super(name, salary, hireDate);
		this.numberOfPublications = numberOfPublications;
	}
	
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	
	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
