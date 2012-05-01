package pl.omega.model.objects;

public class SpyingSond extends CivilShip {
	
	public SpyingSond() {
		super(210);
	}

	public double getShield() {
		return 0.01;
	}

	public int getBaseSpeed() {
		return 100000000;
	}

	public double getAttack() {
		return 0.01;
	}

	public int getCapacity() {
		return 5;
	}

	public int getFuelConsumption() {
		return 1;
	}

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
		return 0;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
