package pl.omega.model.objects;

public class SolarSatelit extends PowerPlant {

	private final int temperatureHigh;

	public SolarSatelit(int universumSpeed, int temperatureHigh) {
		super(universumSpeed);
		this.temperatureHigh = temperatureHigh;
	}

	@Override
	public void countEnergyProduction() {
		producedEnergy = (long) ((temperatureHigh + 140.0) / 6.0 * level);
	}

	public int getStartCrystalNeeds() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getStartDeuteriumNeeds() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getStartEnergyNeeds() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getStartMetalNeeds() {
		// TODO Auto-generated method stub
		return 0;
	}

	// TODO Adam Puchalski - Apr 10, 2012 - level here means the number of
	// saletilts......
}
