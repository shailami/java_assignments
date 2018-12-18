import java.util.*;
class ArmstrongRange
{
	public static void main(String args[])
	{
		for(int number=100;number<=999;number++)
		{
			boolean result=checkArmstrong(number);
			if(result==true)
			{
				System.out.println(number);
			}
			
		}
	}
	static boolean checkArmstrong(int a)
	{
		int sum=0,originalNumber=a;
		while(a!=0)
		{
	 		int mod=(a%10);
		     	a=(a/10);
			int cube=(mod*mod*mod);
			sum=sum+cube;
			// System.out.println(sum);
		}
		if(originalNumber==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
