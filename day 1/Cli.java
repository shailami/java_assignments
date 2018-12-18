import java.util.*;
class Cli
{
	static int count=0;
	public static void main(String args[])
	{
		takeCredentials();	
	}
	static void takeCredentials()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		String username=sc.nextLine();
		System.out.println("Enter Password:");
		String password=sc.nextLine();
		validate(username,password);
	}
	static void validate(String userName,String passWord)
	{
		if(userName.equals("shailaja") && passWord.equals("rockstar"))
		{
			System.out.println("Welcome "+userName);

		}
		else
		{
              		count++;			
			if(count>=3)	
			{
				System.out.println("Contact Admin");
			}
			else
			{
				System.out.println("Invalid Credentials");
				takeCredentials();
			}
			
		}
	}
}
		
	