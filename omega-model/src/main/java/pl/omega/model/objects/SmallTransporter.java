package pl.omega.model.objects;

public class SmallTransporter extends CivilShip {

	public double getShield() {
		return 10;
	}

	// TODO Adam Puchalski - Apr 29, 2012 - when the impulse Technology reaches a specific level, the ST speed sill increase!!!
	public int getBaseSpeed() {
		return 5000;
	}

	public double getAttack() {
		return 5;
	}

	public int getCapacity() {
		return 5000;
	}

	public int getFuelConsumption() {
		return 10;
	}

	public int getStartCrystalNeeds() {
		return 2000;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 2000;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
