import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class WordCount {

	private String line;

	public int countWords(File file) throws IOException {
		int count=0;
		String []str={};
		FileReader fread=new FileReader(file);
		BufferedReader reader = new BufferedReader(fread);
		while((line=reader.readLine())!=null)
		{
			if(!line.equals(""))
			{
				str=line.split(" ");
				count+=str.length;
				for(String element:str)
				{
					System.out.println(element);
				}
			}
		}
		reader.close();
		
		return count;
	}

}
