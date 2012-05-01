package pl.omega.model.objects;

import java.util.List;

public abstract class Ship extends ExecutableOmegaObject implements Flying {

	public Ship(int referenceID) {
		super(referenceID);
	}
	
	// TODO Adam Puchalski - Apr 15, 2012 - the level multiplier is not valid here

	/**
	 * the number of e.g. LightFighters built on a planet, ready to attack :D
	 */
	protected int count;

	protected List<Ship> hasFastCannonsFor;
	protected List<Ship> willFukFastCannonFrom;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setCount(String count) {
		this.count = trimParseToInteger(count);
	}
	
	public int getStructurePoints() {
		return getStartMetalNeeds() + getStartCrystalNeeds();
	}

}
