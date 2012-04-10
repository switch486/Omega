package pl.omega.model;

public class Coordinates {

	private int galaxy;
	private int solarSystem;
	private int planet;
	
	@Override
	public String toString() {
		return "[" + galaxy + ':' + solarSystem + ':' + planet + ']';
	}
	
	public String toUrlPart() {
		// TODO Adam Puchalski - Apr 10, 2012 - must check how the planet selection is being made...
		return null;
	}
	
}
