
public class IceCreamCone {
	
	String flavor; 	
	int scoops;
	
	public IceCreamCone() throws IceCreamConeException{
		
		setFlavor(flavor);
		setScoops(scoops);
		
	
	}
	
	public void setFlavor(String flavor){
		
		this.flavor = flavor;
	}
	
	public void setScoops(int scoops) throws IceCreamConeException{
		
		this.scoops = scoops;
	}

}
