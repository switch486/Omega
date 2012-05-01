package pl.omega.model.objects;

public class ResearchLab extends StationBulding {
	
	public ResearchLab() {
		super(31);
	}

	public int getStartCrystalNeeds() {
		return 400;
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
