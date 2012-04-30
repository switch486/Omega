package pl.omega.model;


public class SolarSystemPlanets {
	
	private final NeighbourPlanet [] planets = new NeighbourPlanet [15];
	
	public NeighbourPlanet getPlanet(int planetNumber) {
		return planets[computePlanetNumber(planetNumber)];
	}

	public void setPlanet (NeighbourPlanet p, int planetNumber) {
		planets[computePlanetNumber(planetNumber)] = p;
	}
	
	public boolean isPlanetFree (int planetNumber) {
		return planets[computePlanetNumber(planetNumber)] == null;
	}
	
	private int computePlanetNumber(int planetNumber) {
		return planetNumber-1;
	}
	
}
