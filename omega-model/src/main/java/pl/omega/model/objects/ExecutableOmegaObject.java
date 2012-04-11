package pl.omega.model.objects;

import java.util.List;

public abstract class ExecutableOmegaObject implements Buildable {
	
	protected List<ExecutableOmegaObject> dependendsOn;
	
	protected double levelMultiplayer;
	
	public String name;
	protected final int universumSpeed;
	
	public ExecutableOmegaObject(int universumSpeed) {
		this.universumSpeed = universumSpeed;
	}
	
}
