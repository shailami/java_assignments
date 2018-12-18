
public class DeletingWord {

	private String output="";
	private String newstr;
	private String[] newArray;
	int x=0;
	private String str;

	public String getResult(String input, String string, int i) 
	{
		newstr =input.replaceAll("\\s+"," ");
		System.out.println(newstr);
		String [] sArray=newstr.split(" ");
		for(int j=0;j<sArray.length;j++)
		{
			if(j!=(i-1))
			{
				str=sArray[j]+" ";
				output+=str;
				System.out.println(str);
			}
		}
		System.out.println(output.trim());
		return output.trim();
	}

}
