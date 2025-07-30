package learningFileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class newMethod {

	public static void main(String[] args) {
		
		File file = new File("example.txt");
		
		try(FileReader fileReader = new FileReader(file);
			BufferedReader bufred = new BufferedReader(fileReader);) {
			
			String line = bufred.readLine();
			while(line!=null) {
				System.out.println(line);
				line = bufred.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		} 
		
	}

}



