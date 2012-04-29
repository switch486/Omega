package pl.omega.model.objects;

public class IonTechnology extends TechnologyResearch {

	public int getStartCrystalNeeds() {
		return 300;
	}

	public int getStartDeuteriumNeeds() {
		return 100;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 1000;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
