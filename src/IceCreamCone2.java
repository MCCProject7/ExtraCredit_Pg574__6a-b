import java.util.Arrays;


public class IceCreamCone2 {

	public static String[] flav = {"Chocolate", "Vanilla", "Rainbow", "PeanutButter"};
	
	public IceCreamCone2(String flavor) throws IceCreamConeException
	{
		flavor.toLowerCase();
		
		if(Arrays.asList(flav).contains(flavor))
		{
			// Just a check
		}
		else 
		{
			throw(new IceCreamConeException(flavor, IceCreamCone.getScoops()));
		}
		
	}
	
}
