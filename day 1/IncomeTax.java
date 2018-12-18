import java.util.*;
class IncomeTax
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter CTC");
			int ctc=sc.nextInt();
			incomeTax(ctc);
		}
	static void incomeTax(int x)
		{
			double taxAmount;
 			if(x<=180000)
			{
				System.out.println("IncomeTax: NIL");
			}
			else if(x<=300000)
			{
				taxAmount=(double)(0.1*x);
				System.out.println("IncomeTax:"+taxAmount);
			}
			else if(x<=500000)
			{
				taxAmount=(double)(0.2*x);
				System.out.println("IncomeTax:"+taxAmount);
			}
			else if(x<=1000000)
			{
				taxAmount=(double)(0.3*x);
				System.out.println("IncomeTax:"+taxAmount);
			}
		}
}
				


				