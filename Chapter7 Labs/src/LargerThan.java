
public class LargerThan {

	

	public void largerNums(int[] numbers, int input)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] > input)
			{
				System.out.println(numbers[i] + " is greater than the input");
			}
		}
	}
	
}
