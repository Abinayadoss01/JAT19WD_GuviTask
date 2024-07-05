package Task11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class FileException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader File;
		try {
			File = new FileReader("C:\\Users\\abina\\eclipse-workspace\\Data\\LoginCredentials.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
		
		
	}

}
