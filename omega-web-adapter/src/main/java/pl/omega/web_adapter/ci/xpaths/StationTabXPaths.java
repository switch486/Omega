package pl.omega.web_adapter.ci.xpaths;

public class StationTabXPaths extends AbstractXPaths {

	public static final String stationRobotFactoryXPath = getStationXPathWith("station14");
	public static final String stationDockXPath = getStationXPathWith("station21");
	public static final String stationResearchLabXPath = getStationXPathWith("station31");
	public static final String stationAllyDepositXPath = getStationXPathWith("station34");
	public static final String stationRocketSiloXPath = getStationXPathWith("station44");
	public static final String stationNanitFactoryXPath = getStationXPathWith("station15");
	public static final String stationTerraformerXPath = getStationXPathWith("station33");

	private static String getStationXPathWith(String part) {
		return "//div[@class='"+part+"']/div/a/span[@class='ecke']/span";
	}
}
