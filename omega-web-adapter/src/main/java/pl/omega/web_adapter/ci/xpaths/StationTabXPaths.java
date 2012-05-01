package pl.omega.web_adapter.ci.xpaths;

import pl.omega.model.objects.AllyDeposit;
import pl.omega.model.objects.Dock;
import pl.omega.model.objects.NanitFactory;
import pl.omega.model.objects.ResearchLab;
import pl.omega.model.objects.RobotFactory;
import pl.omega.model.objects.RocketSilo;
import pl.omega.model.objects.Terraformer;

public class StationTabXPaths extends AbstractXPaths {
	
	private static final String stationPageKeyword = "station";

	public static final String stationRobotFactoryXPath  = getStationXPathWith(new RobotFactory().referenceID);
	public static final String stationDockXPath          = getStationXPathWith(new Dock().referenceID);
	public static final String stationResearchLabXPath   = getStationXPathWith(new ResearchLab().referenceID);
	public static final String stationAllyDepositXPath   = getStationXPathWith(new AllyDeposit().referenceID);
	public static final String stationRocketSiloXPath    = getStationXPathWith(new RocketSilo().referenceID);
	public static final String stationNanitFactoryXPath  = getStationXPathWith(new NanitFactory().referenceID);
	public static final String stationTerraformerXPath   = getStationXPathWith(new Terraformer().referenceID);

	private static String getStationXPathWith(int referenceID) {
		return getStandardXPathWith(stationPageKeyword + referenceID); 
	}
}
