public class CarLauncher {

	public static void main(String[] args) {
		
		
		FuelGauge fuel = new FuelGauge();
		Odometer odometer = new Odometer();

		for (int x = 0; x < FuelGauge.MAXIMUM_GALLONS; x++) {
			fuel.addGallons();
		}

		// dive until you can't drive no longer.
		while (fuel.getGallons() > 0) {

			// add mile driven
			odometer.addMileage();

			// Display the mileage.
			System.out.println("Mileage: " + odometer.getMileage());

			// Display the amount of fuel.
			System.out.println("Fuel level: " + fuel.getGallons() + " gallons");
			System.out.println("------------------------------");
		}
}
}
