
public class Odometer {

	public Odometer() {
		
	}
	
	public final int MAXIMUM_MILEAGE = 999999;

	// Constant for the miles-per-gallon
	public final int MPG = 24;

	private int initialMileage;
	private int mileage;

	// Field to reference a FuelGauge object
	private FuelGauge fuelGauge;

	public Odometer(int mileage, FuelGauge fuel) {
		this.initialMileage = mileage;
		this.mileage = mileage;
		this.fuelGauge = fuel;
	}

	
	public int getMileage() {
		return mileage;
	}

	
	public void addMileage() {

		if (mileage < MAXIMUM_MILEAGE) {
			mileage++;
		} else {
			mileage = 0;
		}

		int driven = initialMileage - mileage;
		if (driven % MPG == 0) {
			FuelGauge.burnFuel();
		}
	}
}


	


