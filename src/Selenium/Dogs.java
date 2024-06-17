package Selenium;

public class Dogs {

	int Age;
	String Breed;
	String Size;
	String Color;

	public Dogs(String Breed, String Size, int Age, String Color) {
		// TODO Auto-generated constructor stub
		System.out.println("Dogs t1 is " + Breed);
		System.out.println("Dogs t1 is " + Size);
		System.out.println("Dogs t1 is " + Age);
		System.out.println("Dogs t1 is " + Color +"\n");
	}

	public static void main(String[] arg) {
		// TODO Auto-generated method stub

		Dogs t1 = new Dogs("Neapolitan Mastiff", "Large", 5, "Black");
		Dogs t2 = new Dogs("Maltese", "Small", 2, "White");
		Dogs t3 = new Dogs("Chow Chaow", "Medium", 3, "Brown");

//		System.out.println("Dogs t1 is " + t1.Breed + " " + t1.Size + " " + t1.Age + " " + t1.Color + " ");
//		System.out.println("Dogs t2 is " + t2.Breed + " " + t2.Size + " " + t2.Age + " " + t2.Color + " ");
//		System.out.println("Dogs t3 is " + t3.Breed + " " + t3.Size + " " + t3.Age + " " + t3.Color + " ");
	}

}
