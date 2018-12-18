public class Palindrome {

	public Object isPalindrome(int number) throws InvalidNumberException {
		if(number<10)
			throw new InvalidNumberException();
		int original=number,reverse=0;
		while(number>0)
		{
			int digit=number%10;
			number/=10;
			reverse=reverse*10+digit;
		}
		if(original==reverse)
		return true;
		else
		return false;
	}

}
