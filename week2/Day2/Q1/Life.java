package week2.Day2.Q1;

public class Life extends Insurance {

	public Life(String typeOfInsurance) {
		super(typeOfInsurance);
	}
	
	public void setCost() {
		this.monthlyPrice = 196;
	}
	
	public void display(){
		System.out.println("Monthly fee of Life Insurance costs $" + this.getMonthlyPrice());
	}
}
