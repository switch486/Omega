package pl.omega.model.objects;

public class RobotFactory extends StationBulding {
	
	public RobotFactory() {
		super(14);
	}

	public int getStartCrystalNeeds() {
		return 120;
	}

	public int getStartDeuteriumNeeds() {
		return 200;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 400;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
