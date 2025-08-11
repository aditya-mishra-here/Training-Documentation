package com.java.annotations;

class Animal {
	  void makeSound() {
	    System.out.println("Animal sound");
	  }
	}

	class Dog extends Animal {
	  @Override
	  void makeSound() { // Typo here!
	    System.out.println("Woof!");
	  }
	}

	public class Main {
	  public static void main(String[] args) {
	    Animal myDog = new Dog();
	    myDog.makeSound();
	  }
}
