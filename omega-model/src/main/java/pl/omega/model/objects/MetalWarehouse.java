package pl.omega.model.objects;

public class MetalWarehouse extends Warehouse {
	
	public MetalWarehouse() {
		super(22);
	}
	
	//Magazyn metalu (2) - 1 000 : 0 : 0

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
		return 1000;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
