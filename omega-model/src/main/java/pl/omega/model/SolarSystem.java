package pl.omega.model;

public class SolarSystem {

	protected int galaxy;
	protected int solarSystem;

	public SolarSystem(int galaxy, int solarSystemNumber) {
		this.galaxy = galaxy;
		this.solarSystem = solarSystemNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + galaxy;
		result = prime * result + solarSystem;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SolarSystem))
			return false;
		SolarSystem other = (SolarSystem) obj;
		if (galaxy != other.galaxy)
			return false;
		if (solarSystem != other.solarSystem)
			return false;
		return true;
	}
	

}