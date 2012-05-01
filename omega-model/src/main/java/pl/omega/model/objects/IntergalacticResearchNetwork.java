package pl.omega.model.objects;

public class IntergalacticResearchNetwork extends AdvancedResearch {
	
	public IntergalacticResearchNetwork() {
		super(123);
	}

	public int getStartCrystalNeeds() {
		return 400000;
	}

	public int getStartDeuteriumNeeds() {
		return 160000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 240000;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
