package pl.omega.model.objects;

public abstract class Research extends ExecutableOmegaObject implements Buildable, Improvable {
	
	public Research(int referenceID) {
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
