package Selenium;

import java.util.*;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "Delhi, India";

		if(address.endsWith("India")) {
			if (address.contains("Meerut")) {
				System.out.println("Your city is Meerut");

			} else if(address.contains("Noida")) {
				System.out.println("Your city is Noida");

			}else {
				System.out.println(address.split(",")[0]);
			} 
		}
			else
			{
				System.out.println("You are not living in India");
			}
		

	}

}
