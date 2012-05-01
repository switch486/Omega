package pl.omega.model.objects;

public class CrystalMine extends Mine {
	
	public CrystalMine() {
		super(2);
	}
	
	//Kopalnia kryształu (1,6) - 48 : 24 : 0

	public int getStartCrystalNeeds() {
		return 24;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 48;
	}

	public double getLevelMultiplayer() {
		return 1.6;
	}

//	@Override
//	public void updateProduction() {
//		production = (long) (20.0 * level * Math.pow(1.1, level));
//		production *= universumSpeed;
//	}
//
//	@Override
//	protected void updateEnergyNeeds() {
//		energyNeeded = (long) Math.ceil(10.0 * level * Math.pow(1.1, level));
//	}

}
