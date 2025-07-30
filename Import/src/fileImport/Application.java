package fileImport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        File file = new File("example.txt");

        try {
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String str = input.nextLine();
                System.out.println(str);
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        
        myFileUtils myUtil = new myFileUtils();
        try {
			int rem = myUtil.substract10FromLargerNumber(7);
			System.out.println(rem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
