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

}
