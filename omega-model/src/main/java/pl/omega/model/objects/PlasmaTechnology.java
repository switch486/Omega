package pl.omega.model.objects;

public class PlasmaTechnology extends TechnologyResearch {
	
	public PlasmaTechnology() {
		super(122);
	}

	public int getStartCrystalNeeds() {
		return 4000;
	}

	public int getStartDeuteriumNeeds() {
		return 1000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 2000;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
