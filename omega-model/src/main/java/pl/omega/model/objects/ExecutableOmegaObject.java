package pl.omega.model.objects;

import java.util.List;

public class ExecutableOmegaObject {
	
	protected String name;
	protected int startMetalNeeds;
	protected int startCrystalNeeds;
	protected int startDeuteriumNeeds;
	protected int startEnergyNeeds;
	protected double levelMultiplayer;
	
	protected List<ExecutableOmegaObject> dependendsOn;
	
}
