package structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("panda");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.contains("hello"));
		
		list.clear();
		
		System.out.println(list.isEmpty());
		

//		for(String s: list) {
//			System.out.println(s);
//		}
//		
//		String item = list.get(1);
//		
//		
//		
//		System.out.println(item);
//		
//		LinkedList<Integer> numbers = new LinkedList<Integer>();
//		numbers.add(100);
//		numbers.add(22);
//		
//		for(int i: numbers) {
//			System.out.println(i);
//		}
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("Honda", "accord", 1200, false));
		vehicles.add(new Vehicle("Jeep", "Wrangler", 1000, true));
		
		for(Vehicle car: vehicles) {
			System.out.println(car);
		}
		
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(14);
		values.add(28);
		values.add(29);
		values.add(28);
		
		for(int i: values) {
			System.out.println(i);
		}
		
		ArrayList<Integer> myList = new ArrayList<Integer>(values);
		Collections.sort(myList);
		System.out.println(myList);
		

		HashSet<Employees> employeeSet = new HashSet<>();

        // Adding 4 example employees
        employeeSet.add(new Employees(101, "Alice", 50000));
        employeeSet.add(new Employees(102, "Bob", 60000));
        employeeSet.add(new Employees(103, "Charlie", 55000));
        employeeSet.add(new Employees(104, "Diana", 52000));
        

        List<Employees> employeeList = new ArrayList<>(employeeSet);
        Collections.sort(employeeList);


        for (Employees emp : employeeList) {
            System.out.println(emp);
        }

		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Brave", "courage");
		dictionary.put("Brilliant", "tallented");
		dictionary.put("Joy", "happy");
		dictionary.put("Confidence", "state of truth");
		
		for(String word: dictionary.keySet()) {
			System.out.println(word);
		}
		
		for(String w: dictionary.keySet()) {
			System.out.println(dictionary.get(w));
		}
		
	}

}
