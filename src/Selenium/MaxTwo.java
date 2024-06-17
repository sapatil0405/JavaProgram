package Selenium;

import java.util.Scanner;

public class MaxTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the value a: ");
		int a = x.nextInt();

		Scanner y = new Scanner(System.in);
		System.out.print("Enter the value b: ");
		int b = y.nextInt();

//		int a = 50;
//		int b = 100;

		if (a > b) {
			System.out.println("The max value is a = " + a);
		} else {
			System.out.println("The max value is b = " + b);
		}

	}

}
