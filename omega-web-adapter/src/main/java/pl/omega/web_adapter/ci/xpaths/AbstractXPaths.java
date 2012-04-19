package pl.omega.web_adapter.ci.xpaths;

public abstract class AbstractXPaths {
	/**
	 * xpath with its attributes
	 */
	// TODO Adam Puchalski - Apr 17, 2012 - maybe it will be faster if the
	// metaXpath tag would looke like /html/head/... and not the // which causes
	// the Xpath to search for valid entries in the XML document
	public static final String metaXPath = "//meta[@name]";
	public static final String metaAttributeNameKey = "name";
	public static final String metaAttributeContentKey = "content";
	public static final String metaAttributeValueUniverseSpeed = "ogame-universe-speed";
	public static final String metaAttributeValueHomePlanetID = "ogame-planet-id";
	public static final String metaAttributeValueHomePlanetName = "ogame-planet-name";
	public static final String metaAttributeValueHomePlanetCoordinates = "ogame-planet-coordinates";

	public static final String resourceMetalXPath = "//span[@id='resources_metal']";
	public static final String resourceCrystalXPath = "//span[@id='resources_crystal']";
	public static final String resourceDeuteriumXPath = "//span[@id='resources_deuterium']";
	public static final String resourceEnergyXPath = "//span[@id='resources_energy']";
	public static final String resourceDarkmatterXPath = "//span[@id='resources_darkmatter']";
	
	// for <div id="countColonies">
	public static final String planetCountXPath = "//div[@id='countColonies']/p/span";
	// for <div id="myWorlds"> and <div class="smallplanet">
	public static final String planetsXPath = "//div[@id='myWorlds']/div[@class='smallplanet']/a";
	public static final String planetsAttributeHrefKey = "href";

}
