
public class ParkedCar {

	public ParkedCar() {
		
	}
	
	private String make, model, color, licenseNumber;//The make of the car, The model of the car,  The color of the car,licenseNumber The car's license number
	private int minutesParked;// minutesParked The minutes the car has been parked
	
	
	ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked)
	{
		setMake(make);
		setModel(model);
		setColor(color);
		setLicenseNumber(licenseNumber);
		setMinutesParked(minutesParked);
	}
	//gets color of car
	public String getColor()
	{
		return color;
	}
	//gets license number
	public String getLicenseNumber()
	{
		return licenseNumber;
	}
	//gets make of car
	public String getMake()
	{
		return make;
	}
	//gets minutes parked
	public int getMinutesParked()
	{
		return minutesParked;
	}
	//gets model of car
	public String getModel()
	{
		return model;
	}
	//sets color of car
	public void setColor(String color)
	{
		this.color = color;
	}
	//sets license plate number
	public void setLicenseNumber(String licenseNumber)
	{
		this.licenseNumber = licenseNumber;
	}
	//sets make of car
	public void setMake(String make)
	{
		this.make = make;
	}
	//sets minutes parked
	public void setMinutesParked(int minutesParked)
	{
		this.minutesParked = minutesParked;
	}
	//sets model of car
	public void setModel(String model)
	{
		this.model = model;
	}

}
