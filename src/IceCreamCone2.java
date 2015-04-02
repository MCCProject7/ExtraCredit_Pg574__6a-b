import java.util.Arrays;


public class IceCreamCone2 {

	String[] flav = {"Chocolate", "Vanilla", "Rainbow", "PeanutButter"};
	
	public IceCreamCone2(String flavor) throws IceCreamConeException
	{
		
		if(Arrays.asList(flav).contains(flavor))
		{
			// Just a check
		}
		else 
		{
			throw(new IceCreamConeException(flavor));
		}
		
	}
	
}
