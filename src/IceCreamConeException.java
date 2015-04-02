
public class IceCreamConeException extends Exception{
	
	String iceCreamCone;
	int numOfscoops;
	
	
	public IceCreamConeException(int numOfscoops) {
		
		
		if(numOfscoops > 3)
		{
			super.getMessage();
		}
	
	
	}
	
	
	@Override
	public String getMessage(){
		
		String Message = "Sorry number of scoops is greater then three";
		
		return Message;
		
	}
	
	
	

}
