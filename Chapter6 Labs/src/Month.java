
public class Month{
	enum eMonth {filler, january, february, march, april, may, june, july, august, september, october, november, december}
	private int monthNumber;
	
	//return the monthNumber
	 
	
	public int getMonthNumber() {
		return monthNumber;
	}
	
	 //param monthNumber the monthNumber to set

	public void setMonthNumber(int monthNum) {
		this.monthNumber = 1;
		if(monthNum > 1 && monthNum <= 12){
			this.monthNumber = monthNum;
		}
	}
	public String getMonthName(){
		return eMonth.values()[getMonthNumber()].name();
	}
	public Month() {
		this.setMonthNumber(1);
		
	}
	public Month(int monthNum) {
		this.setMonthNumber(1);
		if(monthNum > 1 && monthNum <= 12){
			this.setMonthNumber(monthNum);
		}
	}
	public Month(String monthName) {
		this.setMonthNumber(1);
		for(int i = 0; i < eMonth.values().length; i++){
			if(monthName.equalsIgnoreCase(eMonth.values()[i].name()))
			{		
				this.setMonthNumber(eMonth.values()[i].ordinal());
			}
		}
	}
	
	 //see java.lang.Object#toString()
	
	
	public String toString() {
		return getMonthName();
	}

	
	//see java.lang.Object#equals(java.lang.Object)
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		if (monthNumber != other.monthNumber)
			return false;
		return true;
	}
	
	public boolean greaterThan(Month m){
	
		if(this.monthNumber > m.monthNumber){
			return true;
		}else{
			return false;
		}
		
		
	}
	
	public boolean lessThan(Month m){
		if(this.monthNumber < m.monthNumber){
			return true;
		}else{
			return false;
		}
		
		
	}
	
	
	
	
}

