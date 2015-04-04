/*ThrowIceCream created by Kyle Wolff and Brandon VanderMey Fri Apr 03 21:19:27 EDT 2015*/

import java.util.Date;
import java.util.Scanner;


public class ThrowIceCream {

	private static IceCreamCone icecream;

	public static void main(String[] args) throws IceCreamConeException {
		
		Scanner key = new Scanner(System.in);
		
		String flav = null;
		int numScoops = 0;
		
		Date today = new Date();
		
		System.out.println("ThrowIceCream created by Kyle Wolff and Brandon VanderMey " + today);
		
		
		System.out.print("What flavor would you like: ");
		flav = key.nextLine();
		
		System.out.print("\nHow many scoops? :");
		numScoops = key.nextInt();
		
		icecream = new IceCreamCone(flav, numScoops);
		
		System.out.print("\n\nThank You");

		

	}

}
