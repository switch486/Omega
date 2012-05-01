package pl.omega.model.objects;

public class HyperspaceEngine extends EngineResearch {
	
	public HyperspaceEngine() {
		super(118);
	}

	public int getStartCrystalNeeds() {
		return 20000;
	}

	public int getStartDeuteriumNeeds() {
		return 6000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 10000;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
