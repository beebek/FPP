package week2.Day1.Q1;

public class CabinRental {
	int cabinNum;
	double weeklyRentalRate;
	
	public CabinRental(int cabinNum) {
		this.cabinNum = cabinNum;
		if(cabinNum==1 || cabinNum==2 || cabinNum==3)
			weeklyRentalRate = 950;
		else
			weeklyRentalRate = 1100;
	}
	
	public int getCabinNum() {
		return cabinNum;
	}
	
	public double getWeeklyRentalRate() {
		return weeklyRentalRate;
	}
}
