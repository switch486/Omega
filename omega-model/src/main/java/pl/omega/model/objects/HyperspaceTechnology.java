package pl.omega.model.objects;

public class HyperspaceTechnology extends TechnologyResearch {
	
	public HyperspaceTechnology() {
		super(114);
	}

	public int getStartCrystalNeeds() {
		return 4000;
	}

	public int getStartDeuteriumNeeds() {
		return 2000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 0;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
