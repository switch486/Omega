package pl.omega.model.objects;

public abstract class Building extends ExecutableOmegaObject {

	protected int level;
	
	public Building(int universumSpeed) {
		super(universumSpeed);
	}
	
	protected abstract void levelChanged();
	
	public void upgradeBuilding () {
		level ++;
		levelChanged();
	}
	
}
