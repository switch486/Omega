package pl.omega.model.objects;

public abstract class Mine extends Building {

	protected long energyNeeded;
	protected long production;

	public long getProduction() {
		return production;
	}
	
	public long getEnergyNeeds() {
		return energyNeeded;
	}

}
