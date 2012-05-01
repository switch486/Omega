package pl.omega.model.objects;

public class Astrophysics extends AdvancedResearch {
	
	public Astrophysics() {
		super(124);
	}

	public int getStartCrystalNeeds() {
		return 8000;
	}

	public int getStartDeuteriumNeeds() {
		return 4000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 4000;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
