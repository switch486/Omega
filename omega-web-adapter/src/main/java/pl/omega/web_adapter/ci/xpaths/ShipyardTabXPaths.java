package pl.omega.web_adapter.ci.xpaths;

public class ShipyardTabXPaths extends AbstractXPaths {

	public static final String shipyardLightFighterXPath = getShipyardXPathWith("military204");
	public static final String shipyardHeavyFighterXPath = getShipyardXPathWith("military205");
	public static final String shipyardCruiserXPath = getShipyardXPathWith("military206");
	public static final String shipyardWarHorseXPath = getShipyardXPathWith("military207");
	public static final String shipyardPanzerXPath = getShipyardXPathWith("military215");
	public static final String shipyardBomberXPath = getShipyardXPathWith("military211");
	public static final String shipyardDestroyerXPath = getShipyardXPathWith("military213");
	public static final String shipyardDeathStarXPath = getShipyardXPathWith("military214");

	public static final String shipyardSmallTransporterXPath = getShipyardXPathWith("civil202");
	public static final String shipyardBigTransporterXPath = getShipyardXPathWith("civil203");
	public static final String shipyardColonizatorXPath = getShipyardXPathWith("civil208");
	public static final String shipyardRecyclerXPath = getShipyardXPathWith("civil209");
	public static final String shipyardSpyingSondXPath = getShipyardXPathWith("civil210");
	public static final String shipyardSolarSatelitXPath = getShipyardXPathWith("civil212");

	private static String getShipyardXPathWith(String part) {
		return "//div[@class='" + part + "']/div/a/span[@class='ecke']/span";
	}

}
