package pl.omega.model.objects;

public class DeuteriumMine extends Mine {
	
	public DeuteriumMine() {
		super(3);
	}
	
	//Ekstraktor deuteru (1,5) - 225 : 75 : 0
	
//	private final int temperatureHigh;

	public int getStartCrystalNeeds() {
		return 75;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 225;
	}

	public double getLevelMultiplayer() {
		return 1.5;
	}

//	@Override
//	public void updateProduction() {
//		production = (long)(30.0 * level * Math.pow(1.1, level) * ( 1.44 - (0.004 * temperatureHigh ))); 
//		production *= universumSpeed;
//	}
//
//	@Override
//	protected void updateEnergyNeeds() {
//		energyNeeded = (long) Math.ceil(20.0 * level * Math.pow(1.1, level));
//	}

}
