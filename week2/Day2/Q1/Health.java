package week2.Day2.Q1;

public class Health extends Insurance {
	

	public Health(String typeOfInsurance) {
		super(typeOfInsurance);
	}

	public void setCost() {
		this.setMonthlyPrice(36);
	}
	
	public void display(){
		System.out.println("Monthly fee of Health Insurance costs $" + this.getMonthlyPrice());
	}
}
