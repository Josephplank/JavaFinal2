import java.text.*;

public class CashRegister {

	private RetailItem item;
	private double quantity;
	
	public CashRegister(RetailItem item, double quantity) {
		this.item =item;
		this.quantity = quantity;
	}
	
	public double getSubtotal()
	{
		 double subTotal;
		 subTotal = quantity * item.getSub();
		 return subTotal;
	}
	
	public double getTax()
	{
		double salesTax;
		salesTax = getSubtotal() * 0.06;
		return salesTax;
	}
	
	public double getTotal()
	{
		double total;
		total = getSubtotal() + getTax();
		return total;
		
	}
	
	public String toString()
	{
		 
		DecimalFormat format = new DecimalFormat("#,##0.00");
		String newLine = System.getProperty("line.separator");
		String str;
		
		
		str = "SALE RECIEPT"+ 
		newLine + "Unit Price: $" + format.format(item.getSub())  +
		newLine + "Quantity: " + quantity +
		newLine + "Subtotal: $" + format.format(getSubtotal()) +
		newLine + "Tax: $" +  format.format(getTax()) +
		newLine + "Total: $" +  format.format(getTotal());
		
		return str;
	}

}
