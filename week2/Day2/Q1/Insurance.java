package week2.Day2.Q1;

abstract class Insurance {
	String typeOfInsurance;
	double monthlyPrice;
	
	public Insurance(String typeOfInsurance) {
		this.typeOfInsurance = typeOfInsurance;
	}

	public String getTypeOfInsurance() {
		return typeOfInsurance;
	}

	public void setTypeOfInsurance(String typeOfInsurance) {
		this.typeOfInsurance = typeOfInsurance;
	}

	public double getMonthlyPrice() {
		return monthlyPrice;
	}

	public void setMonthlyPrice(double monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	
	public abstract void setCost(); 
	public abstract void display();

}
