package generics;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<?> employees = new ArrayList<>();
		ArrayList<String> accountant2 = new ArrayList<String>();
		employees = accountant2;
		
	}

}
