package pl.omega.model.objects;

public class AttackTechnology extends WarResearch {

	public int getStartCrystalNeeds() {
		return 200;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 800;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
