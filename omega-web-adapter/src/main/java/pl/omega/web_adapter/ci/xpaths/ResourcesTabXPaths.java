package pl.omega.web_adapter.ci.xpaths;

public class ResourcesTabXPaths extends AbstractXPaths {

	public static final String resourceMetalXPath = getResourceXPathWith("supply1");
	public static final String resourceCrystalXPath = getResourceXPathWith("supply2");
	public static final String resourceDeuteriumXPath = getResourceXPathWith("supply3");
	public static final String resourceSolarPowerPlantXPath = getResourceXPathWith("supply4");
	public static final String resourceFusionPowerPlantXPath = getResourceXPathWith("supply12");
	public static final String resourceSolarSatelitXPath = getResourceXPathWith("supply212");
	
	public static final String resourceMetalWarehouseXPath = getResourceXPathWith("supply22");
	public static final String resourceCrystalWarehouseXPath = getResourceXPathWith("supply23");
	public static final String resourceDeuteriumWarehouseXPath = getResourceXPathWith("supply24");
	
	public static final String resourceMetalHideoutXPath = getResourceXPathWith("supply25");
	public static final String resourceCrystalHideoutXPath = getResourceXPathWith("supply26");
	public static final String resourceDeuteriumHideoutXPath = getResourceXPathWith("supply27");
	
	private static String getResourceXPathWith(String part) {
		return "//div[@class='"+part+"']/div/a/span[@class='ecke']/span";
	}
}
