import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice \n 1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICATION \n 4.DIVISION");
		int choice=sc.nextInt();
		System.out.println("ENTER VALUE OF X:");
		int x=sc.nextInt();
		System.out.println("ENTER VALUE OF Y:");
		int y=sc.nextInt();
		
			switch(choice)
			{
				case 1:System.out.println("Addition:"+(x+y));
				break;
				case 2:System.out.println("Subtraction:"+(x-y));
				break;
				case 3:System.out.println("Multiplication:"+(x*y));
				break;
				case 4:float division=(float)x/y;
				       System.out.println("Division:"+division);
				break;
				default:System.out.println("INVALID CHOICE");
			}
	}
}