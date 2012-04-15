package pl.omega.model.objects;

import java.util.List;

public abstract class Ship extends ExecutableOmegaObject implements Flying {
	
	// TODO Adam Puchalski - Apr 15, 2012 - the level multiplier is not valid here
	
	protected List<Ship> hasFastCannonsFor;
	protected List<Ship> willFukFastCannonFrom;

}
