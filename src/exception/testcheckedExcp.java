package exception;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class testcheckedExcp {

	public static void main(String args[]) {
		FileReader fr=null;
		try {
			File file = new File("E://file.txt");
			fr = new FileReader(file); 
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
		try {
			fr.close();
		
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		}
	}
}

