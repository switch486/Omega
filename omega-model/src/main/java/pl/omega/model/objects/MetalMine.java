package pl.omega.model.objects;

public class MetalMine extends Mine {
	
	public MetalMine() {
		super(1);
	}
	// Kopalnia metalu (1,5) - 60 : 15 : 0
	
	// TODO Adam Puchalski - Apr 24, 2012 - maybe there is a better place for this... parsing this will cause tonns of problems
	public int getStartCrystalNeeds() {
		return 15;
	}

	public int getStartDeuteriumNeeds() {
		return 0;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 60;
	}

	public double getLevelMultiplayer() {
		return 1.5;
	}
	

//	@Override
//	public void updateProduction() {
//		production = (long) (30.0 * level * Math.pow(1.1, level));
//		production *= universumSpeed;
//	}
//
//	@Override
//	protected void updateEnergyNeeds() {
//		energyNeeded = (long) Math.ceil(10.0 * level * Math.pow(1.1, level));
//	}

}
