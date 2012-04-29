package pl.omega.model.objects;

public class LaserTechnology extends TechnologyResearch {

	public int getStartCrystalNeeds() {
		return 100;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 200;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
