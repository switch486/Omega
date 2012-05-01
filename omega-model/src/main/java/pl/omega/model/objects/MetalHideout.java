package pl.omega.model.objects;

public class MetalHideout extends Hideout {
	
	public MetalHideout() {
		super(25);
	}

	public int getStartCrystalNeeds() {
		return 0;
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
