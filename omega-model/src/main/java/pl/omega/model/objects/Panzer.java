package pl.omega.model.objects;

public class Panzer extends WarShip {
	
	public Panzer() {
		super(215);
	}

	public int getStartCrystalNeeds() {
		return 40000;
	}

	public int getStartDeuteriumNeeds() {
		return 15000;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 30000;
	}

	public double getShield() {
		return 400;
	}

	public int getBaseSpeed() {
		return 10000;
	}

	public double getAttack() {
		return 700;
	}

	public int getCapacity() {
		return 750;
	}

	public int getFuelConsumption() {
		return 250;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
