package FirstTask;

import java.util.Scanner;

public class calculateCartTotal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of items : ");
		int n = sc.nextInt();
		
		if(n==0) {
			System.out.println("Sum total : 0.0");
		}
		
		Double itemPrice[] = new Double[n];
		
		for(int i=0; i<n;i++) {
			System.out.println("Enter the price of "+i+"th item : ");
			itemPrice[i] = sc.nextDouble();
		}
		
		
		System.out.println("Enter the percentage of discount : ");
		Double discountPercent = sc.nextDouble();
		
		
		double sumTotal = 0.0;
		
		for(Double j : itemPrice) {
			sumTotal+=j;
		}
		
		double finalPrice = sumTotal - ((discountPercent*sumTotal)/100);
		System.out.println("Final Total Price : " + finalPrice);
		

	}

}
