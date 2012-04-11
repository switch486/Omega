package pl.omega.model.objects;

public abstract class Mine extends Building {

	protected long energyNeeded;
	protected long production;

	public Mine(int universumSpeed) {
		super(universumSpeed);
	}

	public long getProduction() {
		return production;
	}
	
	public long getEnergyNeeds() {
		return energyNeeded;
	}

	@Override
	protected void levelChanged() {
		updateProduction();
		updateEnergyNeeds();
	}
	
	protected abstract void updateProduction();
	
	protected abstract void updateEnergyNeeds();

}
