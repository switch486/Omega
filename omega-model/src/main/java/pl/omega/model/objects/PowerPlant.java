package pl.omega.model.objects;

public abstract class PowerPlant extends Building {
	
	public PowerPlant(int referenceID) {
		super(referenceID);
	}
	
	protected long producedEnergy;

}
