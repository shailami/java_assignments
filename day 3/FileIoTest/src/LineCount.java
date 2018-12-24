import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LineCount {

	public int countLine(File file) throws IOException {
		int count = 0;
		FileReader fread=new FileReader(file);
		BufferedReader reader = new BufferedReader(fread);
		while (reader.readLine() != null) count++;
		reader.close();
		return count;
	}
}
