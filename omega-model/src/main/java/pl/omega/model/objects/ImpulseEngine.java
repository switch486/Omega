package pl.omega.model.objects;

public class ImpulseEngine extends EngineResearch {
	
	public ImpulseEngine() {
		super(117);
	}

	public int getStartCrystalNeeds() {
		return 4000;
	}

	public int getStartDeuteriumNeeds() {
		return 600;
	}

	public int getStartEnergyNeeds() {
		return 0;
	}

	public int getStartMetalNeeds() {
		return 2000;
	}

	public double getLevelMultiplayer() {
		return 2;
	}

}
