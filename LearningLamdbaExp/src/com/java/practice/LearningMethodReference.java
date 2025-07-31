package com.java.practice;

import java.util.function.Function;

public class LearningMethodReference {

	public static void main(String[] args) {
		        Function<String, Integer> parseInt = Integer::parseInt;
		        System.out.println(parseInt.apply("123")); 
		    }

	}

