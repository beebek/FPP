package week2.Day1.Q1;

public class HolidayCabinRental extends CabinRental {
	public HolidayCabinRental(int cabinNum) {
		super(cabinNum);
		weeklyRentalRate += 150;
	}
}