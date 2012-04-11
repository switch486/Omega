package pl.omega.model.objects;

public class MetalMine extends Mine {

	public MetalMine(int universumSpeed) {
		super(universumSpeed);
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

	@Override
	public void updateProduction() {
		production = (long) (30.0 * level * Math.pow(1.1, level));
		production *= universumSpeed;
	}

	@Override
	protected void updateEnergyNeeds() {
		energyNeeded = (long) Math.ceil(10.0 * level * Math.pow(1.1, level));
	}

}
