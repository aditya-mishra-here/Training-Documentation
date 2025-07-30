package learningFileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("example.txt");
		BufferedReader bufred = null;
		
		try {
			FileReader fileReader = new FileReader(file);
			bufred = new BufferedReader(fileReader);
			
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
			
		} finally {
			try {
				bufred.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	}

}
