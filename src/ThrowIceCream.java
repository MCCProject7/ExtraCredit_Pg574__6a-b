import java.util.Scanner;


public class ThrowIceCream {

	private static IceCreamCone icecream;

	public static void main(String[] args) throws IceCreamConeException {
		
		Scanner key = new Scanner(System.in);
		
		String flav = null;
		int numScoops = 0;
		
	
		
		
		System.out.print("What flavor would you like: ");
		flav = key.nextLine();
		
		System.out.print("\nHow many scoops? :");
		numScoops = key.nextInt();
		
		icecream = new IceCreamCone(flav, numScoops);
		
		System.out.print("\n\nThank You");

		

	}

}
