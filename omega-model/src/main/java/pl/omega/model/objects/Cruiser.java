package pl.omega.model.objects;

public class Cruiser extends WarShip {
	
	public Cruiser() {
		super(206);
	}

	public int getStartCrystalNeeds() {
		return 7000;
	}

	public int getStartDeuteriumNeeds() {
		return 2000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 20000;
	}

	public double getShield() {
		return 50;
	}

	public int getBaseSpeed() {
		return 15000;
	}

	public double getAttack() {
		return 400;
	}

	public int getCapacity() {
		return 800;
	}

	public int getFuelConsumption() {
		return 300;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
