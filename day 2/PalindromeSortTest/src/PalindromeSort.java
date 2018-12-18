import java.util.Arrays;


public class PalindromeSort {

	private boolean flag;
	public boolean isPalindrome(String[] input)
	{
		for(int i=0;i<input.length;i++)
		{   
			String str="";
			str=input[i].toString();
			int length = str.length();
			String reverse="";
			for (int count=length - 1;count>= 0;count--)
			{
				reverse=reverse+str.charAt(count); 
				
			}
			if (str.equals(reverse))
				flag=true;
			else
				flag=false;
		}
		Arrays.sort(input);
		for(int k=0;k<input.length;k++)
		{
			System.out.println(input[k]);
		}
		return flag;
		}
	}
