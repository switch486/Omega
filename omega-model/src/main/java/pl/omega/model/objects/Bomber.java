package pl.omega.model.objects;

public class Bomber extends WarShip {
	
	public Bomber() {
		super(211);
	}

	public int getStartCrystalNeeds() {
		return 25000;
	}

	public int getStartDeuteriumNeeds() {
		return 15000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 50000;
	}

	public double getShield() {
		return 500;
	}

	public int getBaseSpeed() {
		return 4000;
	}

	public double getAttack() {
		return 1000;
	}

	public int getCapacity() {
		return 500;
	}

	public int getFuelConsumption() {
		return 1000;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
