
public class EmployeeLauncher {

	public static void main(String[] args) {
		
		Employee employ1 = new Employee();
		Employee employ2 = new Employee();
		Employee employ3 = new Employee();
		Employee employ4 = new Employee("Joseph", 12564);
		Employee employ5 = new Employee("Bill", 56723, "IT", "Programmer");
		Employee employ6 = new Employee();
		
		employ1.setName("Susan Meyers");
		employ1.setIdNumber(47899);
		employ1.setDepartment("Accounting");
		employ1.setPosition("Vice President");
		
		employ2.setName("Mark Jones");
		employ2.setIdNumber(39119);
		employ2.setDepartment("IT");
		employ2.setPosition("Programmer");
		
		employ3.setName("Joy Rogers");
		employ3.setIdNumber(81774);
		employ3.setDepartment("Manufacturing");
		employ3.setPosition("Engineer");
		
		
		System.out.println("Name" + "\t\t\t" + "ID Number" + "\t\t" + "Department" + "\t\t" + "Position");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(employ1.getName()+ "\t\t" + employ1.getIdNumber() + "\t\t\t" + employ1.getDepartment() + "\t\t" + employ1.getPosition());
		System.out.println(employ2.getName()+ "\t\t" + employ2.getIdNumber() + "\t\t\t" + employ2.getDepartment() + "\t\t\t" + employ2.getPosition());
		System.out.println(employ3.getName()+ "\t\t" + employ3.getIdNumber() + "\t\t\t" + employ3.getDepartment() + "\t\t" + employ3.getPosition());
		
		
		System.out.println("\nName: " + employ4.getName() + "\nID Number: " + employ4.getIdNumber() + "\nDepartment: " + employ4.getDepartment() + "\nPosition: " + employ4.getPosition());
		System.out.println("\nName: " +  employ5.getName() + "\nID Number: " + employ5.getIdNumber() + "\nDepartment:" + employ5.getDepartment() + "\nPosition: " + employ5.getPosition());
		System.out.println("\nName: " + employ6.getName() + "\nID Number: " + employ6.getIdNumber() + "\nDepartment:" + employ6.getDepartment() + "\nPosition: " + employ6.getPosition());
	}

}
