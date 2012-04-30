package pl.omega.model;

public class Coordinates extends SolarSystem {

	private final int planet;
	
	public Coordinates(String coords) {
		// TODO Adam Puchalski - Apr 30, 2012 - 
		// yes, it is ugly... but maybe noone will notice... :P
		super (0, 0);
		// 1:242:12
		String [] c = coords.replace("[", "").replace("]", "").split(":");
		galaxy = Integer.parseInt(c[0]);
		solarSystem = Integer.parseInt(c[1]);
		planet = Integer.parseInt(c[2]);
	}
	
	public Coordinates(SolarSystem solarSystem, int planet) {
		super(solarSystem.galaxy, solarSystem.solarSystem);
		this.planet = planet;
	}

	@Override
	public String toString() {
		return "[" + galaxy + ':' + solarSystem + ':' + planet + ']';
	}
	
	public String toUrlPart() {
		// TODO Adam Puchalski - Apr 10, 2012 - must check how the planet selection is being made...
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + planet;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Coordinates))
			return false;
		Coordinates other = (Coordinates) obj;
		if (planet != other.planet)
			return false;
		return true;
	}
	
}
