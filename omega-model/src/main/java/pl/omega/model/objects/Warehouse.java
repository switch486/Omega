package pl.omega.model.objects;

public abstract class Warehouse extends Building {

	public Warehouse() {
		super(0);
	}
	
	@Override
	protected void levelChanged() {
		// TODO Adam Puchalski - Apr 11, 2012 - update Warehouse capacity
	}
	
}
