
public class Occurance {

	private int count=0;

	public int noOfOccurance(String string,String[]arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(string))
			{
				count++;
			}
		}
		if(count>0)
			System.out.println("String found "+count+" times");
		else
			System.out.println("String not found"); 
		return count;
	}

}
