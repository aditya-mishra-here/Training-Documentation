package com.java.practice;

import java.util.List;

public class PrintOddNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,2,4,3,4,2,89,91);
		printOddNumbersFromTheListFunctional(numbers);

	}
	
	public static void printOddNumbersFromTheListFunctional(List<Integer> numbers) {
		numbers.stream() //convert to stream
				.filter(number -> number%2 !=0) //lambda expression
				.map(number->number*number*number)
				.forEach(System.out::println); //Method Reference
	}
	
	

}
