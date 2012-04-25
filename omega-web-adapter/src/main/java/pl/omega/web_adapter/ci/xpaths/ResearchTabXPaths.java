package pl.omega.web_adapter.ci.xpaths;


public class ResearchTabXPaths extends AbstractXPaths {

	
	public static final String researchEnergeticTechnologyXPath = getResearchXPathWith("research113");
	public static final String researchLaserTechnologyXPath = getResearchXPathWith("research120");
	public static final String researchIonTechnologyXPath = getResearchXPathWith("research121");
	public static final String researchHyperspaceTechnologyXPath = getResearchXPathWith("research114");
	public static final String researchPlasmaTechnologyXPath = getResearchXPathWith("research122");
	
	public static final String researchSteamEngineXPath = getResearchXPathWith("research115");
	public static final String researchImpulseEngineXPath = getResearchXPathWith("research117");
	public static final String researchHyperspaceEngineXPath = getResearchXPathWith("research118");
	
	public static final String researchSpyTechnologyXPath = getResearchXPathWith("research106");
	public static final String researchComputerTechnologyXPath = getResearchXPathWith("research108");
	public static final String researchAstrophysicsXPath = getResearchXPathWith("research124");
	public static final String researchIntergalacticResearchNetworkXPath = getResearchXPathWith("research123");
	public static final String researchGravitonTechnologyXPath = getResearchXPathWith("research199");
	
	public static final String researchAttackTechnologyXPath = getResearchXPathWith("research109");
	public static final String researchShieldTechnologyXPath = getResearchXPathWith("research110");
	public static final String researchArmourTechnologyXPath = getResearchXPathWith("research111");

	private static String getResearchXPathWith(String part) {
		return "//div[@class='"+part+"']/div/a/span[@class='ecke']/span";
	}
}
