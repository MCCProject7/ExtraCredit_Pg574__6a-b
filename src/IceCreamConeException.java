
public class IceCreamConeException extends ConeException{
	
	String iceCreamCone;
	int numOfscoops;
	
	public IceCreamConeException(String iceCreamCone, int numOfscoops) {
		
		this.iceCreamCone = iceCreamCone;
		this.numOfscoops = numOfscoops;
	
	}
	
	public String geticeCreamConeStr(){
		
		return iceCreamCone;
	}
	
	public int getnumScoops(){
		
		return numOfscoops;
	}
	
	@Override
	public String getMessage() {
		
		super.getMessage(iceCreamCone);
		return iceCreamCone;
	}

}//
