package com.java.lambda;

public class Application {

	public static void main(String[] args) {
		
		walker(()-> System.out.println("Custom object walking....."));
		
		Walkable aBlockOfCode = () -> {
				System.out.println("Custom object walking");
				System.out.println("object tripped");
		};
		
		walker(aBlockOfCode);
		
		ALambdaInterface sayHello = () -> System.out.println("Hello there");
		
		ReturnInterface sum = (a, b) -> a+b;
		System.out.println(sum.someMethod(4, 4));
		
		StringWorker str = (s) -> {
			String result = "";
			for(int i=s.length()-1;i>=0;i--) {
				result += s.charAt(i);
			}
			return result;
		};
		
		System.out.println(str.returnString("Hello"));
		
		ReturnOneInt factorial = (no) -> {
			int res = 1;
			for(int i=1;i<=no;i++) {
				res=i*res;
			}
			return res;
		};
		
		System.out.println(factorial.someMethod(9));
		
		MyGenericInterface<Integer> fact = (no) -> {
			int res = 1;
			for(int i=1;i<=no;i++) {
				res=i*res;
			}
			return res;
		};
		
		System.out.println(factorial.someMethod(10));

		
	}
	
	public static void sayHello() {
		System.out.println("Hello there ");
	}
	
	public int sum(int arg1, int arg2) {
		return arg1+arg2;
	}
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}

}
