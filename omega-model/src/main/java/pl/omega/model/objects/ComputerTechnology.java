package pl.omega.model.objects;

public class ComputerTechnology extends AdvancedResearch {
	
	public ComputerTechnology() {
		super(108);
	}

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
