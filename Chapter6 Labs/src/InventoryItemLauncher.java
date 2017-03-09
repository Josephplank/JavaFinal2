
public class InventoryItemLauncher {

	public static void main(String[] args) {
		
		InventoryItem i1 = new InventoryItem("Large", 5);
		InventoryItem i2 = new InventoryItem(i1);
		
		System.out.println(i2.toString());
	}

}
