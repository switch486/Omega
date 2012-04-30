package pl.omega.web_adapter.ci.xpaths;

public class DefenceTabXPaths extends AbstractXPaths {

	public static final String defenceRocketThrowerXPath = getdefenceXPathWith("defense401");
	public static final String defenceLightLaserGunXPath = getdefenceXPathWith("defense402");
	public static final String defenceHeavyLaserGunXPath = getdefenceXPathWith("defense403");
	public static final String defenceGaussGunXPath = getdefenceXPathWith("defense404");
	public static final String defenceIonGunXPath = getdefenceXPathWith("defense405");
	public static final String defencePlasmaGunXPath = getdefenceXPathWith("defense406");
	public static final String defenceLittleShieldXPath = getdefenceXPathWith("defense407");
	public static final String defenceBigShieldXPath = getdefenceXPathWith("defense408");
	public static final String defenceAntiRocketXPath = getdefenceXPathWith("defense502");
	public static final String defenceInterPlanetarRocketXPath = getdefenceXPathWith("defense503");

	private static String getdefenceXPathWith(String part) {
		return "//div[@class='" + part + "']/div/a/span[@class='ecke']/span";
	}

}
