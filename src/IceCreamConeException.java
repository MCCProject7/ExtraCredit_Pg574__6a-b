import java.util.Arrays;


public class IceCreamConeException extends Exception{
	
	String iceCreamCone;
	int numOfscoops;
	
	
	
	public IceCreamConeException(String iceCreamCone, int numOfscoops)
	{
		
		this.numOfscoops = numOfscoops;
		this.iceCreamCone = iceCreamCone;
		getMessage();
	}
	
	
	@Override
	public String getMessage()
	{
		String Message = null;
		
		if(!Arrays.asList(IceCreamCone2.flav).contains(iceCreamCone) && numOfscoops > 3)
		{
			Message = "Sorry we cannot serve " + numOfscoops + " scoops " + "and we do not carry " + "\"" + iceCreamCone + "\""+  " flavor.";
		}
		else if(!Arrays.asList(IceCreamCone2.flav).contains(iceCreamCone))
		{
			Message = "Sorry we do not carry "+ "\"" + iceCreamCone + "\""+  " flavor.";
		}
		else if(numOfscoops > 3)
		{
			Message = "Sorry we cannot serve " + numOfscoops + " scoops.";
		}
			
		
		return Message;
	}
	
	
	

}
