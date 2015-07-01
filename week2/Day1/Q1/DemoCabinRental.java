package week2.Day1.Q1;

public class DemoCabinRental {

	public static void main(String[] args) {
		CabinRental rentCabin1 = new CabinRental(1);
		System.out.println("Weekly Rental Rate for cabin " + rentCabin1.cabinNum + " is " + rentCabin1.weeklyRentalRate);
		CabinRental rentCabin3 = new CabinRental(3);
		System.out.println("Weekly Rental Rate for cabin " + rentCabin3.cabinNum + " is " + rentCabin3.weeklyRentalRate);
	
		HolidayCabinRental holCabin = new HolidayCabinRental(1);
		System.out.println("Weekly Rentale Rate for cabin " + holCabin.cabinNum + " is " + holCabin.weeklyRentalRate);
	}

}

// Output

/*
	Weekly Rental Rate for cabin 1 is 950.0
	Weekly Rental Rate for cabin 3 is 950.0
	Weekly Rentale Rate for cabin 1 is 1100.0
*/
