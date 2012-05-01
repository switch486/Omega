package pl.omega.model.objects;

public class CrystalWarehouse extends Warehouse {
	
	public CrystalWarehouse() {
		super(23);
	}
	
	//Magazyn kryształu (2) - 1 000 : 500 : 0

	public int getStartCrystalNeeds() {
		return 500;
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
