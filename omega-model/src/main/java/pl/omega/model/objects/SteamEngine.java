package pl.omega.model.objects;

public class SteamEngine extends EngineResearch {

	public int getStartCrystalNeeds() {
		return 400;
	}

	public int getStartDeuteriumNeeds() {
		return 600;
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
