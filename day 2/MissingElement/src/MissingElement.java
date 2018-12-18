
public class MissingElement
{
	private int x;
	private int value;
	public int elementMissing(int[] input)
	{
		System.out.println("New Test Case \n");
		for(int ele=0;ele<=input.length;ele++)
		{
			int i = 0;
			if(ele==input[i])
			{
				x=i;
			}
			else
			{
				while (i < input.length && ele != input[i])
				{
					i++; 
					x=i; 
					if(x>input.length-1)
					{
						value=ele;
					}
				}
			}
			if(x<input.length)
			System.out.println("Element" +ele+" Found at"+x+" index");
			else
			System.out.println("Element" +ele+" Not Found");		
		}
		System.out.println();
		return value;
	}
}
