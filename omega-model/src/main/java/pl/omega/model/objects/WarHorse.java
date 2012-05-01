package pl.omega.model.objects;

public class WarHorse extends WarShip {
	
	public WarHorse() {
		super(207);
	}

	public int getStartCrystalNeeds() {
		return 15000;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 45000;
	}

	public double getShield() {
		return 200;
	}

	public int getBaseSpeed() {
		return 10000;
	}

	public double getAttack() {
		return 1000;
	}

	public int getCapacity() {
		return 1500;
	}

	public int getFuelConsumption() {
		return 500;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
