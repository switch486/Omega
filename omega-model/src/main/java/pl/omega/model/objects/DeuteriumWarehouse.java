package pl.omega.model.objects;

public class DeuteriumWarehouse extends Warehouse {
	//Zbiornik deuteru (2) - 1 000 : 1 000 : 0

	public int getStartCrystalNeeds() {
		return 1000;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 1000;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
