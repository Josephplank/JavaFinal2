
public class ParkingTicket {

	public ParkingTicket() {
		
	}
	
	ParkedCar parkedCar;
	ParkingMeter parkingMeter;
	PoliceOfficer policeOfficer;
	
	/**
	 * Sets the police officer, the parked car, and the parking meter according to the parameters.
	 * 
	 * @param policeOfficer The police officer who issued the ticket
	 * @param parkedCar The illegally parked car
	 * @param parkingMeter The parking meter of the illegally parked car
	 */
	ParkingTicket(PoliceOfficer policeOfficer, ParkedCar parkedCar, ParkingMeter parkingMeter)
	{
		this.policeOfficer = policeOfficer;
		this.parkedCar = parkedCar;
		this.parkingMeter = parkingMeter;
	}
	//gets the color of the car
	public String getColor()
	{
		return parkedCar.getColor();
	}
	//calculates the fine
	public Double getFine()
	{
		int illegalMinutes = parkedCar.getMinutesParked() - parkingMeter.getParkingTimePurchased();
		double fine = 0;
		
		/*
		 * Adds the appropriate amount to the fine and then subtracts
		 * the number of minutes fined from illegalMinutes until
		 * illegalMinutes is equal to, or less than zero.
		 */
		
		if(illegalMinutes >= 60)
		{
			fine += 25.00;
			illegalMinutes -= 60;
		}
		
		while(illegalMinutes > 0)
		{
			if(illegalMinutes >= 60)
			{
				fine += 10.00;
				illegalMinutes -= 60;
			}
			
			else
			{
				fine += 10.00;
				illegalMinutes -= illegalMinutes;
			}
		}
		
		return fine;
	}
	//gets the license number from parked car class
	public String getLicense()
	{
		return parkedCar.getLicenseNumber();
	}
	//gets make of car from parked car class
	public String getMake()
	{
		return parkedCar.getMake();
	}
	//gets the model of the car from the parked car class
	public String getModel()
	{
		return parkedCar.getModel();
	}
	//gets the officers badge number from the officer class
	public String getOfficerBadgeNumber()
	{
		return policeOfficer.getBadgeNumber();
	}
	//gets the officers name from the officer class
	public String getOfficerName()
	{
		return policeOfficer.getName();
	}

}
