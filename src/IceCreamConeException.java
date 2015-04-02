
public class IceCreamConeException extends Exception{
	
	String iceCreamCone;
	int numOfscoops;
	
	
	public IceCreamConeException(int numOfscoops) {
		
		
		if(numOfscoops > 3)
		{
			this.numOfscoops = numOfscoops;
			super.getMessage();
		}
		
		if(numOfscoops == 0)
		{
			String x = String.valueOf(this.numOfscoops);
		}
	
	
	}
	
	public IceCreamConeException(String iceCreamCone)
	{
		this.iceCreamCone = iceCreamCone;
		super.getMessage();
	}
	
	
	@Override
	public String getMessage(){
		
		String Message = null;
		
		if(numOfscoops !=0){
		Message = "Sorry we can not do " + numOfscoops + " scoopss " +" or we do not carry " + iceCreamCone;
		}
		
		return Message;
		
	}
	
	
	

}
