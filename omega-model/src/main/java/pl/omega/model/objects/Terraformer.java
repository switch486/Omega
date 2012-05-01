package pl.omega.model.objects;

public class Terraformer extends StationBulding {
	
	public Terraformer() {
		super(33);
	}

	public int getStartCrystalNeeds() {
		return 50000;
	}

	public int getStartDeuteriumNeeds() {
		return 100000;
	}

	public int getStartEnergyNeeds() {
		return 1000;
	}

	public int getStartMetalNeeds() {
		return 0;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
