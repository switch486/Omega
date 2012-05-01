package pl.omega.model.objects;

public class DeuteriumHideout extends Hideout {
	
	public DeuteriumHideout() {
		super(27);
	}

	public int getStartCrystalNeeds() {
		return 2645;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 2645;
	}

	public double getLevelMultiplayer() {
		return 2.3;
	}

}
