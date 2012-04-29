package pl.omega.model;

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
	
	private Moon moon;
	
	/*
	 * the resources as shown on the TOP
	 */
	private long resMetal;
	private long resCristal;
	private long resDeuterium;
	private long resEnergy;
	private long resDarkMatter;
	
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
	// TODO Adam Puchalski - Apr 29, 2012 - 
	private LightFighter lightFighters;
	private HeavyFighter heavyFighters;
	private Cruiser cruisers;
	private WarHorse warHorses;
	private Panzer panzers;
	private Bomber bombers;
	private Destroyer destroyers;
	private DeathStar deathStars;
	
	private SmallTransporter smallTransporters;
	private BigTransporter bigTransporters;
	private Colonizator colonizators;
	private Recycler recyclers;
	private SpyingSond spyingSonds;
	private SolarSatelit solarSatelites;
	
	
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

	public MetalMine getMetalMine() {
		if (metalMine == null)
			metalMine = new MetalMine();
		return metalMine;
	}

	public void setMetalMine(MetalMine metalMine) {
		this.metalMine = metalMine;
	}

	public CrystalMine getCrystalMine() {
		if (crystalMine == null)
			crystalMine = new CrystalMine();
		return crystalMine;
	}

	public void setCrystalMine(CrystalMine crystalMine) {
		this.crystalMine = crystalMine;
	}

	public DeuteriumMine getDeuteriumMine() {
		if (deuteriumMine == null)
			deuteriumMine = new DeuteriumMine();
		return deuteriumMine;
	}

	public void setDeuteriumMine(DeuteriumMine deuteriumMine) {
		this.deuteriumMine = deuteriumMine;
	}

	public SolarPowerPlant getSolarPowerPlant() {
		if (solarPowerPlant == null)
			solarPowerPlant = new SolarPowerPlant();
		return solarPowerPlant;
	}

	public void setSolarPowerPlant(SolarPowerPlant solarPowerPlant) {
		this.solarPowerPlant = solarPowerPlant;
	}

	public FusionPowerPlant getFusionPowerPlant() {
		if (fusionPowerPlant == null)
			fusionPowerPlant = new FusionPowerPlant();
		return fusionPowerPlant;
	}

	public void setFusionPowerPlant(FusionPowerPlant fusionPowerPlant) {
		this.fusionPowerPlant = fusionPowerPlant;
	}

	public SolarSatelit getSolarSatelites() {
		if (solarSatelites == null)
			solarSatelites = new SolarSatelit();
		return solarSatelites;
	}

	public void setSolarSatelites(SolarSatelit solarSatelites) {
		this.solarSatelites = solarSatelites;
	}

	public MetalWarehouse getMetalWarehouse() {
		if (metalWarehouse == null)
			metalWarehouse = new MetalWarehouse();
		return metalWarehouse;
	}

	public void setMetalWarehouse(MetalWarehouse metalWarehouse) {
		this.metalWarehouse = metalWarehouse;
	}

	public CrystalWarehouse getCrystalWarehouse() {
		if (crystalWarehouse == null)
			crystalWarehouse = new CrystalWarehouse();
		return crystalWarehouse;
	}

	public void setCrystalWarehouse(CrystalWarehouse crystalWarehouse) {
		this.crystalWarehouse = crystalWarehouse;
	}

	public DeuteriumWarehouse getDeuteriumWarehouse() {
		if (deuteriumWarehouse == null)
			deuteriumWarehouse = new DeuteriumWarehouse();
		return deuteriumWarehouse;
	}

	public void setDeuteriumWarehouse(DeuteriumWarehouse deuteriumWarehouse) {
		this.deuteriumWarehouse = deuteriumWarehouse;
	}

	public MetalHideout getMetalHideout() {
		if (metalHideout == null)
			metalHideout = new MetalHideout();
		return metalHideout;
	}

	public void setMetalHideout(MetalHideout metalHideout) {
		this.metalHideout = metalHideout;
	}

	public CrystalHideout getCrystalHideout() {
		if (crystalHideout == null)
			crystalHideout = new CrystalHideout();
		return crystalHideout;
	}

	public void setCrystalHideout(CrystalHideout crystalHideout) {
		this.crystalHideout = crystalHideout;
	}

	public DeuteriumHideout getDeuteriumHideout() {
		if (deuteriumHideout == null)
			deuteriumHideout = new DeuteriumHideout();
		return deuteriumHideout;
	}

	public void setDeuteriumHideout(DeuteriumHideout deuteriumHideout) {
		this.deuteriumHideout = deuteriumHideout;
	}

	public RobotFactory getRobotFactory() {
		if (robotFactory == null)
			robotFactory = new RobotFactory();
		return robotFactory;
	}

	public void setRobotFactory(RobotFactory robotFactory) {
		this.robotFactory = robotFactory;
	}

	public Dock getDock() {
		if (dock == null)
			dock = new Dock();
		return dock;
	}

	public void setDock(Dock dock) {
		this.dock = dock;
	}

	public ResearchLab getResearchLab() {
		if (researchLab == null)
			researchLab = new ResearchLab();
		return researchLab;
	}

	public void setResearchLab(ResearchLab researchLab) {
		this.researchLab = researchLab;
	}

	public AllyDeposit getAllydeposit() {
		if (allydeposit == null)
			allydeposit = new AllyDeposit();
		return allydeposit;
	}

	public void setAllydeposit(AllyDeposit allydeposit) {
		this.allydeposit = allydeposit;
	}

	public RocketSilo getRocketSilo() {
		if (rocketSilo == null)
			rocketSilo = new RocketSilo();
		return rocketSilo;
	}

	public void setRocketSilo(RocketSilo rocketSilo) {
		this.rocketSilo = rocketSilo;
	}

	public NanitFactory getNanitFactory() {
		if (nanitFactory == null)
			nanitFactory = new NanitFactory();
		return nanitFactory;
	}

	public void setNanitFactory(NanitFactory nanitFactory) {
		this.nanitFactory = nanitFactory;
	}

	public Terraformer getTerraformer() {
		if (terraformer == null)
			terraformer = new Terraformer();
		return terraformer;
	}

	public void setTerraformer(Terraformer terraformer) {
		this.terraformer = terraformer;
	}

	public LightFighter getLightFighters() {
		if (lightFighters == null)
			lightFighters = new LightFighter();
		return lightFighters;
	}

	public void setLightFighters(LightFighter lightFighters) {
		this.lightFighters = lightFighters;
	}

	public HeavyFighter getHeavyFighters() {
		if (heavyFighters == null)
			heavyFighters = new HeavyFighter();
		return heavyFighters;
	}

	public void setHeavyFighters(HeavyFighter heavyFighters) {
		this.heavyFighters = heavyFighters;
	}

	public Cruiser getCruisers() {
		if (cruisers == null)
			cruisers = new Cruiser();
		return cruisers;
	}

	public void setCruisers(Cruiser cruisers) {
		this.cruisers = cruisers;
	}

	public WarHorse getWarHorses() {
		if (warHorses == null)
			warHorses = new WarHorse();
		return warHorses;
	}

	public void setWarHorses(WarHorse warHorses) {
		this.warHorses = warHorses;
	}

	public Panzer getPanzers() {
		if (panzers == null)
			panzers = new Panzer();
		return panzers;
	}

	public void setPanzers(Panzer panzers) {
		this.panzers = panzers;
	}

	public Bomber getBombers() {
		if (bombers == null)
			bombers = new Bomber();
		return bombers;
	}

	public void setBombers(Bomber bombers) {
		this.bombers = bombers;
	}

	public Destroyer getDestroyers() {
		if (destroyers == null)
			destroyers = new Destroyer();
		return destroyers;
	}

	public void setDestroyers(Destroyer destroyers) {
		this.destroyers = destroyers;
	}

	public DeathStar getDeathStars() {
		if (deathStars == null)
			deathStars = new DeathStar();
		return deathStars;
	}

	public void setDeathStars(DeathStar deathStars) {
		this.deathStars = deathStars;
	}

	public SmallTransporter getSmallTransporters() {
		if (smallTransporters == null)
			smallTransporters = new SmallTransporter();
		return smallTransporters;
	}

	public void setSmallTransporters(SmallTransporter smallTransporters) {
		this.smallTransporters = smallTransporters;
	}

	public BigTransporter getBigTransporters() {
		if (bigTransporters == null)
			bigTransporters = new BigTransporter();
		return bigTransporters;
	}

	public void setBigTransporters(BigTransporter bigTransporters) {
		this.bigTransporters = bigTransporters;
	}

	public Colonizator getColonizators() {
		if (colonizators == null)
			colonizators = new Colonizator();
		return colonizators;
	}

	public void setColonizators(Colonizator colonizators) {
		this.colonizators = colonizators;
	}

	public Recycler getRecyclers() {
		if (recyclers == null)
			recyclers = new Recycler();
		return recyclers;
	}

	public void setRecyclers(Recycler recyclers) {
		this.recyclers = recyclers;
	}

	public SpyingSond getSpyingSonds() {
		if (spyingSonds == null)
			spyingSonds = new SpyingSond();
		return spyingSonds;
	}

	public void setSpyingSonds(SpyingSond spyingSonds) {
		this.spyingSonds = spyingSonds;
	}
	
	
	// TODO Adam Puchalski - Apr 10, 2012 - ships...
	// TODO Adam Puchalski - Apr 10, 2012 - defence
	// TODO Adam Puchalski - Apr 10, 2012 - rest
	
}
