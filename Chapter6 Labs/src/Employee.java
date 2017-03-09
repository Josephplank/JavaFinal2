
public class Employee {

	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee() {
		
		this.name = "";
		this.idNumber = 0;
		this.department = "";
		this.position ="";
	}
	
	public Employee(String name, int idNumber, String department, String position) {
		
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}
	public Employee(String name, int idNumber) {
		super();
		this.name = name;
		this.idNumber = idNumber;
		this.department = "";
		this.position = "";
	}
	
	
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setIdNumber(int id)
	{
		this.idNumber = id;
	}
	
	public void setDepartment(String depart)
	{
		this.department = depart;
	}
	
	public void setPosition(String pos)
	{
		this.position = pos;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getIdNumber()
	{
		return idNumber;
	}
	public String getDepartment()
	{
		return department;
	}
	public String getPosition()
	{
		return position;
	}
}

