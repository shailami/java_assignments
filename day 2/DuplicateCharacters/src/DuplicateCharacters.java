
public class DuplicateCharacters 
{
	public String removeDuplicates(String string) 
	{
		String input=string;
	    String result="" ;
		for (int i=0;i<input.length();i++) 
		{
	        if(!result.contains(String.valueOf(input.charAt(i))))
	        {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}
}

