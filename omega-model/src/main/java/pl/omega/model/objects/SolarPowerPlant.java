package pl.omega.model.objects;

public class SolarPowerPlant extends PowerPlant {
	
	public SolarPowerPlant() {
		super(4);
	}
	
	//Elektrownia słoneczna (1,5) - 75 : 30 : 0


//	@Override
//	public void countEnergyProduction() {
//		producedEnergy = (long) (20.0 * level * Math.pow(1.1, level));
//	}

	public int getStartCrystalNeeds() {
		return 30;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 75;
	}

	public double getLevelMultiplayer() {
		return 1.5;
	}

}
