import java.io.File;

public class FileIo {

	public boolean exists(File file) {
		if(file.exists())
		return true;
		else
		return false;
	}
}
