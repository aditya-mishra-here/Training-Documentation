package com.java.practice;

import java.util.List;

public class PrintAllCOurses {

	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring", "Spring Boot", "AWS", "Azure", "Java", "CPP");
		
//		printAllCourses(courses);
		printCourseLength(courses);
		
	}

	private static void printCourseLength(List<String> courses) {
		
		courses.stream()
				.map(course -> course+" "+course.length())
				.forEach(System.out::println);
		
	}

//	private static void printAllCourses(List<String> courses) {
//		courses.stream() //convert to stream
//				.filter(s->s.contains("Spring"))
//				.forEach(System.out::println); // Method Reference
//	}
	
	
	
	

}
