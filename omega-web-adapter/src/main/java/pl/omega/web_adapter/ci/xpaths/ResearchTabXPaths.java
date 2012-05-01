package pl.omega.web_adapter.ci.xpaths;

import pl.omega.model.objects.ArmourTechnology;
import pl.omega.model.objects.Astrophysics;
import pl.omega.model.objects.AttackTechnology;
import pl.omega.model.objects.ComputerTechnology;
import pl.omega.model.objects.EnergeticTechnology;
import pl.omega.model.objects.GravitonTechnology;
import pl.omega.model.objects.HyperspaceEngine;
import pl.omega.model.objects.HyperspaceTechnology;
import pl.omega.model.objects.ImpulseEngine;
import pl.omega.model.objects.IntergalacticResearchNetwork;
import pl.omega.model.objects.IonTechnology;
import pl.omega.model.objects.LaserTechnology;
import pl.omega.model.objects.PlasmaTechnology;
import pl.omega.model.objects.ShieldTechnology;
import pl.omega.model.objects.SpyTechnology;
import pl.omega.model.objects.SteamEngine;


public class ResearchTabXPaths extends AbstractXPaths {

	private static final String researchPageKeyword = "research";
	
	public static final String researchEnergeticTechnologyXPath           = getResearchXPathWith(new EnergeticTechnology().referenceID);
	public static final String researchLaserTechnologyXPath               = getResearchXPathWith(new LaserTechnology().referenceID);
	public static final String researchIonTechnologyXPath                 = getResearchXPathWith(new IonTechnology().referenceID);
	public static final String researchHyperspaceTechnologyXPath          = getResearchXPathWith(new HyperspaceTechnology().referenceID);
	public static final String researchPlasmaTechnologyXPath              = getResearchXPathWith(new PlasmaTechnology().referenceID);
	
	public static final String researchSteamEngineXPath                   = getResearchXPathWith(new SteamEngine().referenceID);
	public static final String researchImpulseEngineXPath                 = getResearchXPathWith(new ImpulseEngine().referenceID);
	public static final String researchHyperspaceEngineXPath              = getResearchXPathWith(new HyperspaceEngine().referenceID);
	
	public static final String researchSpyTechnologyXPath                 = getResearchXPathWith(new SpyTechnology().referenceID);
	public static final String researchComputerTechnologyXPath            = getResearchXPathWith(new ComputerTechnology().referenceID);
	public static final String researchAstrophysicsXPath                  = getResearchXPathWith(new Astrophysics().referenceID);
	public static final String researchIntergalacticResearchNetworkXPath  = getResearchXPathWith(new IntergalacticResearchNetwork().referenceID);
	public static final String researchGravitonTechnologyXPath            = getResearchXPathWith(new GravitonTechnology().referenceID);
	
	public static final String researchAttackTechnologyXPath              = getResearchXPathWith(new AttackTechnology().referenceID);
	public static final String researchShieldTechnologyXPath              = getResearchXPathWith(new ShieldTechnology().referenceID);
	public static final String researchArmourTechnologyXPath              = getResearchXPathWith(new ArmourTechnology().referenceID);

	private static String getResearchXPathWith(int referenceID) {
		return getStandardXPathWith(researchPageKeyword + referenceID);
	}
}
