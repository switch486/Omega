package pl.omega.model.objects;

public abstract class Building extends ExecutableOmegaObject {

	private int level;
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = trimParseToInteger(level);
	}
	
}
