
public class InventoryItem {

	private String description;
	private int units;
	
	public InventoryItem(String description, int units) {
		this.description = description;
		this.units = units;
	}
	
	public InventoryItem(InventoryItem object2) {
		description = object2.description;
		units = object2.units;
	}
	
	public String toString()
	{
		String something;
		something = "Description: " + description + "\nUnits: " + units;
		return something;
	}

}
