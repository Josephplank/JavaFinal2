import java.text.DecimalFormat;


 //This class uses an inner class.


public class RetailItem
{
   private String description;  // Item description
   private int itemNumber;      // Item number
   private CostData cost;       // Cost data

   
   public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public int getItemNumber() {
	return itemNumber;
}


public void setItemNumber(int itemNumber) {
	this.itemNumber = itemNumber;
}

     //RetailItem class constructor
   

   public RetailItem(String desc, int itemNum, 
                     double wholesale, double retail)
   {
	   
      setDescription(desc);
      setItemNumber(itemNum);
      cost = new CostData(wholesale, retail);
   }

   
     //RetailItem class toString method 
   

   public String toString()
   {
      String str;  // To hold a descriptive string.
      
      // Create a DecimalFormat object to format output.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");

      // Create a string describing the item.
      str = "Description: " + description
          + "\nItem Number: " + itemNumber
          + "\nWholesale Cost: $" 
          + dollar.format(cost.getWholesale())
          + "\nRetail Price: $" 
          + dollar.format(cost.getRetail());
      
      // Return the string.
      return str;
   }
   
   public double getSub()
   {
	   return cost.getRetail();
   }

   
   //CostData Inner Class
    

   private class CostData
   {
      public double wholesale,  // Wholesale cost
                    retail;     // Retail price
      
      
        //CostData class constructor 
      

      public CostData(double w, double r)
      {
         setWholesale(w);
         setRetail(r);
      }


	public double getWholesale() {
		return wholesale;
	}


	public void setWholesale(double wholesale) {
		this.wholesale = wholesale;
	}


	public double getRetail() {
		return retail;
	}


	public void setRetail(double retail) {
		this.retail = retail;
	}
      
   }
}