package com.java.practice;

import java.util.List;

public class PrintAllCOurses {

	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring", "Spring Boot", "AWS", "Azure", "Java", "CPP");
		
		printAllCourses(courses);
		
	}

	private static void printAllCourses(List<String> courses) {
		courses.stream() //convert to stream
				.filter(s->s.contains("Spring"))
				.forEach(System.out::println); // Method Reference
	}
	
	

}
