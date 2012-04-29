package pl.omega.model.objects;

public class HeavyFighter extends WarShip {

	public int getStartCrystalNeeds() {
		return 4000;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 6000;
	}

	public double getShield() {
		return 25;
	}

	public int getBaseSpeed() {
		return 10000;
	}

	public double getAttack() {
		return 150;
	}

	public int getCapacity() {
		return 100;
	}

	public int getFuelConsumption() {
		return 75;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
