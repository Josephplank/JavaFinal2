
public class ChargeAccountMod {


	
	public static int sequentialSearch(int[] array, int value)
	{
		int index, element;
		boolean found;
		
		index = 0;
		element = -1;
		found = false;
		
		while(!found && index < array.length)
		{
			if(array[index] == value)
			{
				found = true;
				element = index;
			}
			index++;
		}
		return element;
	}

	
	
	
}
