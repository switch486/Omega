package pl.omega.model;

import java.util.List;

import pl.omega.model.objects.AllyDeposit;
import pl.omega.model.objects.BigShield;
import pl.omega.model.objects.BigTransporter;
import pl.omega.model.objects.Bomber;
import pl.omega.model.objects.Building;
import pl.omega.model.objects.Colonizator;
import pl.omega.model.objects.Cruiser;
import pl.omega.model.objects.CrystalHideout;
import pl.omega.model.objects.CrystalMine;
import pl.omega.model.objects.CrystalWarehouse;
import pl.omega.model.objects.DeathStar;
import pl.omega.model.objects.Destroyer;
import pl.omega.model.objects.DeuteriumHideout;
import pl.omega.model.objects.DeuteriumMine;
import pl.omega.model.objects.DeuteriumWarehouse;
import pl.omega.model.objects.Dock;
import pl.omega.model.objects.FusionPowerPlant;
import pl.omega.model.objects.GaussGun;
import pl.omega.model.objects.HeavyFighter;
import pl.omega.model.objects.HeavyLaserGun;
import pl.omega.model.objects.IonGun;
import pl.omega.model.objects.LightFighter;
import pl.omega.model.objects.LightLaserGun;
import pl.omega.model.objects.LittleShield;
import pl.omega.model.objects.MetalHideout;
import pl.omega.model.objects.MetalMine;
import pl.omega.model.objects.MetalWarehouse;
import pl.omega.model.objects.NanitFactory;
import pl.omega.model.objects.Panzer;
import pl.omega.model.objects.PlasmaGun;
import pl.omega.model.objects.Recycler;
import pl.omega.model.objects.ResearchLab;
import pl.omega.model.objects.RobotFactory;
import pl.omega.model.objects.RocketSilo;
import pl.omega.model.objects.RocketThrower;
import pl.omega.model.objects.SmallTransporter;
import pl.omega.model.objects.SolarPowerPlant;
import pl.omega.model.objects.SolarSatelit;
import pl.omega.model.objects.SpyingSond;
import pl.omega.model.objects.Terraformer;
import pl.omega.model.objects.WarHorse;

public class Planet {

	private String name;
	private Coordinates coordinates;
	
	/*
	 * info from the general Tab
	 */
	private int usedFields;
	private int allFields;
	private int temperatureLow;
	private int temperatureHigh;
	// actuallyBuilding, actuallyFinding, actuallyInDock
	/**
	 * this is used to change the planet like: &cp=36514756
	 */
	private long planetID;
	
	/*
	 * Actual Bulding
	 */
	
	private Building actuallyBeingBuilt;
	
	/*
	 * the resources as shown on the TOP
	 */
	private long resMetal;
	private long resCristal;
	private long resDeuterium;
	private long resEnergy;
	private long resDarkMatter;
	
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
	
	private MetalWarehouse metalWarehouse;
	private CrystalWarehouse crystalWarehouse;
	private DeuteriumWarehouse deuteriumWarehouse;
	
	private MetalHideout metalHideout;
	private CrystalHideout crystalHideout;
	private DeuteriumHideout deuteriumHideout;
	
	private RobotFactory robotFactory;
	private Dock dock;
	private ResearchLab researchLab;
	private AllyDeposit allydeposit;
	private RocketSilo rocketSilo;
	private NanitFactory nanitFactory;
	private Terraformer terraformer;
	
	/*
	 * Defence
	 */
	private RocketThrower rocketThrower;
	private LightLaserGun lightLaserGun;
	private HeavyLaserGun heavyLaserGun;
	private GaussGun gaussGun;
	private IonGun ionGun;
	private PlasmaGun plasmaGun;
	private LittleShield littleShield;
	private BigShield bigShield;
	
	/*
	 * Ships
	 */
	private List<LightFighter> lightFighters;
	private List<HeavyFighter> heavyFighters;
	private List<Cruiser> cruisers;
	private List<WarHorse> warHorses;
	private List<Panzer> panzers;
	private List<Bomber> bombers;
	private List<Destroyer> destroyers;
	private List<DeathStar> deathStars;
	
	private List<SmallTransporter> smallTransporters;
	private List<BigTransporter> bigTransporters;
	private List<Colonizator> colonizators;
	private List<Recycler> recyclers;
	private List<SpyingSond> spyingSonds;
	private List<SolarSatelit> solarSatelites;
	
	
	public void calculateProduction() {
		// TODO Adam Puchalski - Apr 10, 2012 - 
	}

	public long getPlanetID() {
		return planetID;
	}

	public void setPlanetID(String planetID) {
		this.planetID = Long.parseLong(planetID);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public long getResMetal() {
		return resMetal;
	}

	public void setResMetal(String resMetal) {
		this.resMetal = toLong(resMetal);
	}

	/**
	 * Actually does the method a bit more than only parsing to a long datatype. 
	 */
	private long toLong(String resMetal) {
		// TODO Adam Puchalski - Apr 18, 2012 - move this method somewhere else, replace by stringutils, or guava?
		return Long.parseLong(resMetal.trim().replace(".", "" ));
	}

	public long getResCristal() {
		return resCristal;
	}

	public void setResCristal(String resCristal) {
		this.resCristal = toLong(resCristal);
	}

	public long getResDeuterium() {
		return resDeuterium;
	}

	public void setResDeuterium(String resDeuterium) {
		this.resDeuterium = toLong(resDeuterium);
	}

	public long getResEnergy() {
		return resEnergy;
	}

	public void setResEnergy(String resEnergy) {
		this.resEnergy = toLong(resEnergy);
	}

	public long getResDarkMatter() {
		return resDarkMatter;
	}

	public void setResDarkMatter(String resDarkMatter) {
		this.resDarkMatter = toLong(resDarkMatter);
	}

	public int getUsedFields() {
		return usedFields;
	}

	public void setUsedFields(int usedFields) {
		this.usedFields = usedFields;
	}

	public int getAllFields() {
		return allFields;
	}

	public void setAllFields(int allFields) {
		this.allFields = allFields;
	}

	public int getTemperatureLow() {
		return temperatureLow;
	}

	public void setTemperatureLow(String temperatureLow) {
		this.temperatureLow = Integer.parseInt(temperatureLow);
	}

	public int getTemperatureHigh() {
		return temperatureHigh;
	}

	public void setTemperatureHigh(String temperatureHigh) {
		this.temperatureHigh = Integer.parseInt(temperatureHigh);
	}

	public void setPlanetSize(String planetSize) {
		String [] s = planetSize.split("/");
		setUsedFields(Integer.parseInt(s[0]));
		setAllFields(Integer.parseInt(s[1]));
	}
	
	// TODO Adam Puchalski - Apr 10, 2012 - ships...
	// TODO Adam Puchalski - Apr 10, 2012 - defence
	// TODO Adam Puchalski - Apr 10, 2012 - rest
	
}
