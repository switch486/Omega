package pl.omega.model.objects;

public class SpyTechnology extends AdvancedResearch {
	
	public SpyTechnology() {
		super(106);
	}

	public int getStartCrystalNeeds() {
		return 1000;
	}

	public int getStartDeuteriumNeeds() {
		return 200;
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
