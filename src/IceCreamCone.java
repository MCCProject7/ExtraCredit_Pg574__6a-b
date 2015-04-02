
public class IceCreamCone {
	
	String flavor; 	
	int scoops;
	
	public IceCreamCone(String flav, int scoops) throws IceCreamConeException
	{
		setScoops(scoops);
		setFlavor(flav);
		
	}
	
	
	
	
	public void setScoops(int scoops)  throws IceCreamConeException
	{
		
		if(scoops > 3)
		{
			throw(new IceCreamConeException(scoops));
		}
		else {
			this.scoops = scoops;
		}
	}
	
	public void setFlavor(String flavor)
	{
		
		this.flavor = flavor;
	}

}
