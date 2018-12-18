
class Reverse
{
	public String getReverse(String string)
	{
		String result="";
		System.out.println(string);
		String strArray[] = string.split(" ");
		for(int i=0;i<strArray.length;i++)
		System.out.println(strArray[i]);
		for(int j=0;j<strArray.length;j++)
		{
			int size=strArray[j].length();
			for(int k=(size-1);k>=0;k--)
			{
				result=result+strArray[j].substring(k,k+1);
			}
			if(j!=(strArray.length-1))
			{
				result+=" ";
			}
		}
		System.out.println(result);
		return result;
		
	}
}