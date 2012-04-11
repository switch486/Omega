package pl.omega.model.objects;

public abstract class PowerPlant extends Building {
	
	protected long producedEnergy;

	public PowerPlant(int universumSpeed) {
		super(universumSpeed);
	}
	
	public abstract void countEnergyProduction();
	
	@Override
	protected void levelChanged() {
		countEnergyProduction();
	}

}
