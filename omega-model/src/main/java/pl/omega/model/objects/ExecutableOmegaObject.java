package pl.omega.model.objects;

import java.util.List;

public abstract class ExecutableOmegaObject implements Buildable {
	
	protected List<ExecutableOmegaObject> dependendsOn;
	
	/**
	 * the name of the Object
	 */
	public String name;
	
	protected int trimParseToInteger (String s) {
		return Integer.parseInt(s.trim());
	}
	
}
