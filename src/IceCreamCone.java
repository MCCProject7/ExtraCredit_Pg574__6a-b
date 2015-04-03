
public class IceCreamCone {
	
	String flavor; 	
	static int scoops;
	
	IceCreamCone2 ice;
	
	public IceCreamCone(String flav, int scoops) throws IceCreamConeException
	{
		setIceCreamOrder(flav, scoops);
		
	}
	
	
	
	
	public void setIceCreamOrder(String flavor, int scoops)  throws IceCreamConeException
	{
		
		if(scoops > 3)
		{
			throw new IceCreamConeException(flavor, scoops);
		}
		else 
		{
			this.scoops = scoops;
			ice = new IceCreamCone2(flavor);
		}
	}
	
	public static int getScoops(){
		
		return scoops;
	}
	
	

}
