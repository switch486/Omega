package pl.omega.model.objects;

public abstract class WarShip extends Ship {
	
	public WarShip(int referenceID) {
		super(referenceID);
	}

	/**
	 * In case You would like to create an OW or a real War ship, please create
	 * WarHorse instead of this, as this is only an abstract parent class
	 */
	
}
