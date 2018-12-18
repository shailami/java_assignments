import java.util.*;
class LinearSearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int array[]=new int[15];
		for(int i=0;i<15;i++)
		{
			System.out.println("Enter "+(i+1)+"th element of the array");
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched");
		int number=sc.nextInt();
		linearSearch(array,number);

	}
	static void linearSearch(int arr[],int num)
	{
		boolean flag=false;
		for(int i=0;i<15;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Element found at "+i+"th index");
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}			
	}		
}