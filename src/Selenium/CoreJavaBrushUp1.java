package Selenium;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int myNum =5;
		String website = "Nasikker Saurabh Youtube Channel";
		char letter ='r';
		double dec =5.99;
		boolean myCard =true;
		
		System.out.println(myNum + " is the value stored in myNum variable ");
		System.out.println(website);
		
////		Arrays 
//		int [] arr =new int[5];
//		arr[0] =1;
//		arr[1] =2;
//		arr[2] =3;
//		arr[3] =4;
//		arr[4] =5;
		
//	for (int i=0; i<arr.length; i++)
		
//		for (int i=0; i<5; i++)
//		{
//			System.out.println(arr[i]);
//		}
		
//		 
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,111};
		
		for (int i =0; i<arr2.length; i++) 
		{
			
			System.out.println(arr2[i]);
		}
			
		
		
		String[] name = {"Nasikker", "Saurabh", "Youtube"};
		
		
		for (int i=0; i<name.length; i++)    
		{
			System.out.println(name[i]);
		}
		
	// enhanced for loop syntax simple and easy	
		for( String s: name)
		{
			System.out.println(s);
		}
		
	}

}

