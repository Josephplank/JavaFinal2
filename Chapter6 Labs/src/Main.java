
public class Main {

	public static void main(String[] args) {
		
		//three objects used by 3 different classes
		PoliceOfficer andy = new PoliceOfficer("Andy Jones", "LD302");
		ParkedCar accord = new ParkedCar("Honda", "Accord 2011", "black", "PK07LVD", 185);
		ParkingMeter meter = new ParkingMeter(30);
		
		//output for officer examining meter
		andy.examineParkedCar(accord, meter);
	}

}
