package pl.omega.model.objects;

public class FusionPowerPlant extends PowerPlant {

	private final int energeticResearchLevel;

	// TODO Adam Puchalski - Apr 11, 2012 - idea needed for the energeticLevelChange!. Listeners?
	// TODO Adam Puchalski - Apr 11, 2012 - the same goes for the deuteriumConsumption...

	public FusionPowerPlant(int universumSpeed, int energeticResearchLevel) {
		super(universumSpeed);
		this.energeticResearchLevel = energeticResearchLevel;
	}

	@Override
	public void countEnergyProduction() {
		producedEnergy = (long) (30 * level * Math.pow(
				1.05 + energeticResearchLevel * 0.01, level));
	}
	
	public void countDeuteriumConsumption() {
//		10 * Poziom * 1,1^Poziom
	}
	
	public int getStartCrystalNeeds() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getStartDeuteriumNeeds() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getStartEnergyNeeds() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getStartMetalNeeds() {
		// TODO Auto-generated method stub
		return 0;
	}

}
