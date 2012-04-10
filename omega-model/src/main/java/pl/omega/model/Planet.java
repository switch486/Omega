package pl.omega.model;

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

public class Planet {

	private String name;
	private Coordinates coordinates;
	
	/*
	 * info from the general Tab
	 */
	private int avaliableFields;
	private int allFields;
	private int temperatureLow;
	private int temperatureHigh;
	// actuallyBuilding, actuallyFinding, actuallyInDock
	/**
	 * this is used to change the planet like: &cp=36514756
	 */
	private long planetID;
	
	/*
	 * the resources as shown on the TOP
	 */
	private long resMetal;
	private long resCristal;
	private long resDeuterium;
	private long resEnergy;
	private long resMetalMax;
	private long resCristalMax;
	private long resDeuteriumMax;
	private long resEnergyMax;
	
	/**
	 * BUILDINGS
	 */
	
	private MetalMine metalMine;
	private CrystalMine crystalMine;
	/*
	 * TODO remember to take the temperature in it!
	 */
	private DeuteriumMine deuteriumMine;
	private SolarPowerPlant solarPowerPlant;
	private FusionPowerPlant fusionPowerPlant;
	private SolarSatelit solarSatelite;
	
	private MetalWarehouse metalWarehouse;
	private CrystalWarehouse crystalWarehouse;
	private DeuteriumWarehouse deuteriumWarehouse;
	private MetalHideout metalHideout;
	private CrystalHideout crystalHideout;
	private DeuteriumHideout deuteriumHideout;
	
	public void calculateProduction() {
		// TODO Adam Puchalski - Apr 10, 2012 - 
	}
	
	// TODO Adam Puchalski - Apr 10, 2012 - ships...
	// TODO Adam Puchalski - Apr 10, 2012 - defence
	// TODO Adam Puchalski - Apr 10, 2012 - rest
	
}
