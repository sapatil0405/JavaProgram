package Selenium;

import java.util.*;

public class Multiplication {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner a= new Scanner(System.in); //System.in is a standard input stream  
			System.out.print("Enter the num: ");  
		int num = a.nextInt();
		for (int i=1; i<=10; i++) {
			System.out.println("THE MULTIPLICATION OF Given number is" + num*i);
			
		}
//		else {
//			System.out.println("I am not understanding");
//			}
//	
	}
}