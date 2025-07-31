package com.java.lambapractical;

@FunctionalInterface
interface CarCondition {
	public boolean test(Car c);
}