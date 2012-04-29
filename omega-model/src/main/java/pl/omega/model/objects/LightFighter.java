package pl.omega.model.objects;

public class LightFighter extends WarShip {
	
	// TODO Adam Puchalski - Apr 29, 2012 - in case the starting costs or parameters vary on different unis, then other Omega pages also need to be parsed (technology tree)

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
		return 3000;
	}

	public double getShield() {
		return 10;
	}

	public int getBaseSpeed() {
		return 12500;
	}

	public double getAttack() {
		return 50;
	}

	public int getCapacity() {
		return 50;
	}

	public int getFuelConsumption() {
		return 20;
	}

	public double getLevelMultiplayer() {
		return 0;
	}

}
