package pl.omega.web_adapter.ci.xpaths;

import pl.omega.model.objects.CrystalHideout;
import pl.omega.model.objects.CrystalMine;
import pl.omega.model.objects.CrystalWarehouse;
import pl.omega.model.objects.DeuteriumHideout;
import pl.omega.model.objects.DeuteriumMine;
import pl.omega.model.objects.DeuteriumWarehouse;
import pl.omega.model.objects.FusionPowerPlant;
import pl.omega.model.objects.MetalHideout;
import pl.omega.model.objects.MetalMine;
import pl.omega.model.objects.MetalWarehouse;
import pl.omega.model.objects.SolarPowerPlant;
import pl.omega.model.objects.SolarSatelit;

public class ResourcesTabXPaths extends AbstractXPaths {
	
	private static final String resourcesPageKeyword = "supply";

	public static final String resourceMetalXPath              = getResourceXPathWith(new MetalMine().referenceID);
	public static final String resourceCrystalXPath            = getResourceXPathWith(new CrystalMine().referenceID);
	public static final String resourceDeuteriumXPath          = getResourceXPathWith(new DeuteriumMine().referenceID);
	public static final String resourceSolarPowerPlantXPath    = getResourceXPathWith(new SolarPowerPlant().referenceID);
	public static final String resourceFusionPowerPlantXPath   = getResourceXPathWith(new FusionPowerPlant().referenceID);
	public static final String resourceSolarSatelitXPath       = getResourceXPathWith(new SolarSatelit().referenceID);
	
	public static final String resourceMetalWarehouseXPath     = getResourceXPathWith(new MetalWarehouse().referenceID);
	public static final String resourceCrystalWarehouseXPath   = getResourceXPathWith(new CrystalWarehouse().referenceID);
	public static final String resourceDeuteriumWarehouseXPath = getResourceXPathWith(new DeuteriumWarehouse().referenceID);
	
	public static final String resourceMetalHideoutXPath       = getResourceXPathWith(new MetalHideout().referenceID);
	public static final String resourceCrystalHideoutXPath     = getResourceXPathWith(new CrystalHideout().referenceID);
	public static final String resourceDeuteriumHideoutXPath   = getResourceXPathWith(new DeuteriumHideout().referenceID);
	
	private static String getResourceXPathWith(int referenceID) {
		return getStandardXPathWith(resourcesPageKeyword + referenceID);
	}
}
