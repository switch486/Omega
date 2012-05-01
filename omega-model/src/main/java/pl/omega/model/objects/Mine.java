package pl.omega.model.objects;

public abstract class Mine extends Building {
	
	public Mine(int referenceID) {
		super(referenceID);
	}

	protected long energyNeeded;
	protected long production;

	public long getProduction() {
		return production;
	}
	
	public long getEnergyNeeds() {
		return energyNeeded;
	}

}
