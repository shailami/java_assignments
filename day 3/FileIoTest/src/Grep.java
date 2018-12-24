import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;


public class Grep {
	
	

	private String line;
	private int count;
	private String result="";

	public String findNumberOfLines(File file, String string) throws IOException {
		Map <Integer ,String>map=new LinkedHashMap();
		FileReader fread=new FileReader(file);
		BufferedReader reader = new BufferedReader(fread);
		while((line=reader.readLine())!=null)
		{ 
			count++;
			if(line.contains(string))
			{
				result=map.put(count, line);
			}
			else
			{
				map.put(count, "Element not found");
			}
			result=map.toString();
		}
		return result;
	}
}
