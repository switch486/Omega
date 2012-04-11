package pl.omega.model.objects;

public class SolarPowerPlant extends PowerPlant {

	public SolarPowerPlant(int universumSpeed) {
		super(universumSpeed);
	}

	@Override
	public void countEnergyProduction() {
		producedEnergy = (long) (20.0 * level * Math.pow(1.1, level));
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

}
