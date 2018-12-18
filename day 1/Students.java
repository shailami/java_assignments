import java.util.*;
public class Students {
	Scanner sc=new Scanner(System.in);
	int []temp=new int[3];
	public int[] getDetails1()
	{
		System.out.println("Enter marks");
		for(int i=0;i<3;i++)
		{
			System.out.println("For subject "+(i+1));
			temp[i]=sc.nextInt();
		}
			return temp;
	}
		
	public void displayDetails(int arr[])
	{
		System.out.print("Displaying Marks of students :");
		for(int i=0;i<3;i++)
		{
			System.out.print(arr[i]);
		}
			System.out.println();
			
	}

	public void getTotal(int []arr)
	{
		int totalScore = 0;
		int avgscore = 0;
		System.out.println("Displaying Total Marks and Average of students");
		for(int i=0;i<3;i++)
		{
			totalScore=totalScore+arr[i];
			avgscore=totalScore/3;
		}
			System.out.println("Total score="+totalScore+" Average score="+avgscore);
			
		}

	public void subjectTotalAndAverage(int[] m1, int[] m2, int[] m3)
	{
		for(int i=0;i<3;i++)
		{
			int totalSubject,avgSubject;
			totalSubject=m1[i]+m2[i]+m3[i];
			System.out.println("For Subject "+(i+1)+" total="+totalSubject);
			avgSubject=totalSubject/3;
			System.out.println("For Subject "+(i+1)+" Average="+avgSubject);
		}	
	}
	public static void main(String args[])
	{
		int M1[]=new int[3];
		int M2[]=new int[3];
		int M3[]=new int[3];
		
	
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();
	 
		M1=s1.getDetails1();
		M2=s2.getDetails1();
		M3=s3.getDetails1();
		
		s1.displayDetails(M1);
		s2.displayDetails(M2);
		s3.displayDetails(M3);
		
		s1.getTotal(M1);
		s2.getTotal(M2);
		s3.getTotal(M3);
		
		s1.subjectTotalAndAverage(M1,M2,M3);
		
	}
}
