package pl.omega.model.objects;

public class AllyDeposit extends StationBulding {
	
	public AllyDeposit() {
		super(34);
	}

	public int getStartCrystalNeeds() {
		return 40000;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
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
