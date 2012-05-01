package pl.omega.model.objects;

public abstract class Defence extends ExecutableOmegaObject implements Defending {

	public Defence(int referenceID) {
		super(referenceID);
	}
	
	/**
	 * the number of e.g. LightLasers built on a planet
	 */
	protected int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setCount(String count) {
		this.count = trimParseToInteger(count);
	}

}
