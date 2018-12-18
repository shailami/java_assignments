import java.util.*;
class SequentialSort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int array[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter "+(i+1)+"th element of the array");
			array[i]=sc.nextInt();
		}
		sequentialSort(array);
	}
	static void sequentialSort(int arr[])
	{
		for(int k=0;k<4;k++)
		{
			int minimum=k;
			for(int j=k+1;j<5;j++)
			{
				if(arr[minimum]>arr[j])
				{
					minimum=j;
					int temp=arr[minimum];
					arr[minimum]=arr[k];
					arr[k]=temp;
				}	
			}
		}
		System.out.println("Sorted array is :");	
		for(int x=0;x<5;x++)
		{
			System.out.println(arr[x]);
		}
	}
}
