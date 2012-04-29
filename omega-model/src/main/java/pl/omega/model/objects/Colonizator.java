package pl.omega.model.objects;

public class Colonizator extends CivilShip {

	public double getShield() {
		return 100;
	}

	public int getBaseSpeed() {
		return 2500;
	}

	public double getAttack() {
		return 50;
	}

	public int getCapacity() {
		return 7500;
	}

	public int getFuelConsumption() {
		return 1000;
	}

	public int getStartCrystalNeeds() {
		return 20000;
	}

	public int getStartDeuteriumNeeds() {
		return 10000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 10000;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
