import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int number=sc.nextInt();
		int result=checkArmstrong(number);
		if(number==result)
		 {
			 System.out.println("Armstrong Number"); 
		 }
		 else
		 {
			System.out.println("Not an Armstrong Number"); 
		 }
	}
	static int checkArmstrong(int a)
	{
		int sum=0;
		while(a!=0)
		{
			int mod=(a%10);
		    	a=(a/10);
			int cube=(mod*mod*mod);
			sum=sum+cube;
			// System.out.println(sum);
		}
		return (sum);
	}
}
