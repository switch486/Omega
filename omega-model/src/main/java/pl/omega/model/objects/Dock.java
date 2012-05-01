package pl.omega.model.objects;

public class Dock extends StationBulding {
	
	public Dock() {
		super(21);
	}

	public int getStartCrystalNeeds() {
		return 200;
	}

	public int getStartDeuteriumNeeds() {
		return 100;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 400;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
