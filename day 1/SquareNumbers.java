import java.util.*;
class SquareNumbers
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER A VALUE");
			int number=sc.nextInt();
			myFunction(number);
		}
	static void myFunction(int a)
		{
			for(int i=1;i<=10;i++)
			{
				int r=a*i;
				System.out.println(+a+"*"+i+"="+r+"----"+(r*r));
			}
    		}
}
