package pl.omega.model.objects;

public class RocketSilo extends StationBulding {

	public int getStartCrystalNeeds() {
		return 20000;
	}

	public int getStartDeuteriumNeeds() {
		return 1000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 20000;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
