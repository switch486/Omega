package pl.omega.model.objects;

public class DeathStar extends WarShip {

	public int getStartCrystalNeeds() {
		return 4000000;
	}

	public int getStartDeuteriumNeeds() {
		return 1000000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 5000000;
	}

	public double getShield() {
		return 50000;
	}

	public int getBaseSpeed() {
		return 100;
	}

	public double getAttack() {
		return 200000;
	}

	public int getCapacity() {
		return 1000000;
	}

	public int getFuelConsumption() {
		return 1;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
