package pl.omega.model;

public class Coordinates {

	private final int galaxy;
	private final int solarSystem;
	private final int planet;
	
	public Coordinates(String coords) {
		// 1:242:12
		String [] c = coords.replace("[", "").replace("]", "").split(":");
		galaxy = Integer.parseInt(c[0]);
		solarSystem = Integer.parseInt(c[1]);
		planet = Integer.parseInt(c[2]);
	}

	@Override
	public String toString() {
		return "[" + galaxy + ':' + solarSystem + ':' + planet + ']';
	}
	
	public String toUrlPart() {
		// TODO Adam Puchalski - Apr 10, 2012 - must check how the planet selection is being made...
		return null;
	}
	
}
