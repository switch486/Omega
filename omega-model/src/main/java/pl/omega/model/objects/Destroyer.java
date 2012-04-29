package pl.omega.model.objects;

public class Destroyer extends WarShip {

	public int getStartCrystalNeeds() {
		return 50000;
	}

	public int getStartDeuteriumNeeds() {
		return 15000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 60000;
	}

	public double getShield() {
		return 500;
	}

	public int getBaseSpeed() {
		return 5000;
	}

	public double getAttack() {
		return 2000;
	}

	public int getCapacity() {
		return 2000;
	}

	public int getFuelConsumption() {
		return 1000;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
