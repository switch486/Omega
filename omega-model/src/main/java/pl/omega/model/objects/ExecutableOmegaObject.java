package pl.omega.model.objects;

import java.util.List;

public abstract class ExecutableOmegaObject implements Buildable {
	
	protected List<ExecutableOmegaObject> dependendsOn;
	
	/**
	 * how many resources does the next level upgrade cost (only for research and buildings)
	 */
	protected double levelMultiplayer;
	
	/**
	 * the name of the Object
	 */
	public String name;
	
}
