package pl.omega.model.objects;

public abstract class Building extends ExecutableOmegaObject {
	
	public Building(int referenceID) {
		super(referenceID);
	}

	private int level;
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = trimParseToInteger(level);
	}
	
}
