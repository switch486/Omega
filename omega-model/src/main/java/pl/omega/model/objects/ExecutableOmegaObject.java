package pl.omega.model.objects;

import java.util.List;

public abstract class ExecutableOmegaObject implements Buildable {
	
	protected List<ExecutableOmegaObject> dependendsOn;
	
	/**
	 * the name of the Object
	 */
	// TODO Adam Puchalski - Apr 26, 2012 - check if the name is relevant at all!
	public String name;
	
	protected int trimParseToInteger (String s) {
		return Integer.parseInt(s.trim());
	}
	
}
