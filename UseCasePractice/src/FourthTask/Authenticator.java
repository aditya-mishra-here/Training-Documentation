package FourthTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Authenticator {
	
	private HashMap<String, String> map = new HashMap<String, String>();
	
	public void loadUsers(String filePath) {
		
		try {
	        
			File file = new File(filePath);
	        Scanner sc = new Scanner(file);

	        while(sc.hasNextLine()) {
	        	String line = sc.nextLine();
	        	String[] parts = line.split(":", 2);
	        	if (parts.length == 2) {
	                String key = parts[0].trim();
	                String value = parts[1].trim();
	                map.put(key, value);
	            }
	        }
	        
	        sc.close();
	        
	        System.out.println("Data loaded successfully !!");

	        for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println("Key is : "+entry.getKey() + ", Value is : " + entry.getValue());
            }

	        
		} catch (FileNotFoundException e) {
			System.out.println("File not found error !!");
		}
		catch (IOException e) {
			System.out.println("Error reading the file !!");
		}
        
	}
	
	public boolean authenticate(String username, String pass) {
		if(map.containsKey(username) && (map.get(username)).equals(pass)) {
			System.out.println("Correct credentials");
			return true;
		}
		else{
			System.out.println("Invalid credentials");
			return false;
		}
	}
	
	
}
