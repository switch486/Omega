package pl.omega.model.objects;

public class Recycler extends CivilShip {
	
	public Recycler() {
		super(209);
	}

	public double getShield() {
		return 10;
	}

	public int getBaseSpeed() {
		return 1000;
	}

	public double getAttack() {
		return 1;
	}

	public int getCapacity() {
		return 20000;
	}

	public int getFuelConsumption() {
		return 300;
	}

	public int getStartCrystalNeeds() {
		return 6000;
	}

	public int getStartDeuteriumNeeds() {
		return 2000;
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
