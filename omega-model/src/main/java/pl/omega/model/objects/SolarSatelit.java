package pl.omega.model.objects;

public class SolarSatelit extends CivilShip {
	
//	private final int temperatureHigh;

//	@Override
//	public void countEnergyProduction() {
//		producedEnergy = (long) ((temperatureHigh + 140.0) / 6.0 * level);
//	}

	public int getStartCrystalNeeds() {
		return 2000;
	}

	public int getStartDeuteriumNeeds() {
		return 500;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 0;
	}

	public int getBaseSpeed() {
		return 0;
	}

	public int getCapacity() {
		return 0;
	}

	public int getFuelConsumption() {
		return 0;
	}

	public double getShield() {
		return 1;
	}

	public double getAttack() {
		return 1;
	}

	public double getLevelMultiplayer() {
		return 0;
	}
}
