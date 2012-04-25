package pl.omega.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.omega.model.objects.ArmourTechnology;
import pl.omega.model.objects.Astrophysics;
import pl.omega.model.objects.AttackTechnology;
import pl.omega.model.objects.ComputerTechnology;
import pl.omega.model.objects.EnergeticTechnology;
import pl.omega.model.objects.GravitonTechnology;
import pl.omega.model.objects.HyperspaceEngine;
import pl.omega.model.objects.HyperspaceTechnology;
import pl.omega.model.objects.ImpulseEngine;
import pl.omega.model.objects.IntergalacticResearchNetwork;
import pl.omega.model.objects.IonTechnology;
import pl.omega.model.objects.LaserTechnology;
import pl.omega.model.objects.PlasmaTechnology;
import pl.omega.model.objects.ShieldTechnology;
import pl.omega.model.objects.SpyTechnology;
import pl.omega.model.objects.SteamEngine;

public class Kingdom {
	
	/**
	 * TODO - a statistics engine should be implemented somehow!!!!!1 maybe in the logic?
	 */
	
	private int universumSpeed; 
	
	private long score;
	private int positionActuall;
	private int gamersActuall;
	
	private Planet homePlanet;

	private final List<Planet> planets = new ArrayList<Planet>();
	
	private final Map<Coordinates, Planet> neighbourMap = new HashMap<Coordinates, Planet>();
	
	/*
	 * Research
	 */
	private EnergeticTechnology energeticTechnology;
	private LaserTechnology laserTechnology;
	private IonTechnology ionTechnology;
	private HyperspaceTechnology hyperspaceTechnology;
	private PlasmaTechnology plasmaTechnology;
	private SteamEngine steamEngine;
	private ImpulseEngine impulseEngine;
	private HyperspaceEngine hyperspaceEngine;
	private SpyTechnology spyTechnology;
	private ComputerTechnology computerTechnology;
	private Astrophysics astrophysics;
	private IntergalacticResearchNetwork intergalacticResearchNetwork;
	private GravitonTechnology gravitonTechnology;
	private AttackTechnology attackTechnology;
	private ShieldTechnology shieldTechnology;
	private ArmourTechnology armourTechnology;
	
	/**
	 * fields needed to calculate things faster
	 */
	
	private int fleetMax;

	public int getUniversumSpeed() {
		return universumSpeed;
	}

	public void setUniversumSpeed(String universumSpeed) {
		this.universumSpeed = Integer.parseInt(universumSpeed);
	}

	public Planet getHomePlanet() {
		return homePlanet;
	}

	public void setHomePlanet(Planet homePlanet) {
		this.homePlanet = homePlanet;
	}

	public long getScore() {
		return score;
	}

	/**
	 * Actually does the method a bit more than only parsing to a long datatype. 
	 */
	private long toLong(String string) {
		// TODO Adam Puchalski - Apr 18, 2012 - move this method somewhere else, replace by stringutils, or guava?
		return Long.parseLong(string.trim().replace(".", "" ));
	}
	
	/**
	 * Actually does the method a bit more than only parsing to a int datatype. 
	 */
	private int toInt(String string) {
		// TODO Adam Puchalski - Apr 18, 2012 - move this method somewhere else, replace by stringutils, or guava?
		return Integer.parseInt(string.trim().replace(".", "" ));
	}
	
	public void setScore(String score) {
		this.score = toLong(score);
	}

	public int getPositionActuall() {
		return positionActuall;
	}

	public void setPositionActuall(String positionActuall) {
		this.positionActuall = toInt(positionActuall);
	}

	public int getGamersActuall() {
		return gamersActuall;
	}

	public void setGamersActuall(String gamersActuall) {
		this.gamersActuall = toInt(gamersActuall);
	}
	
	public Planet getPlanet(int i) {
		return planets.get(i);
	}
	
	public void addPlanet (Planet p) {
		planets.add(p);
	}
	
	public int getPlanetCount () {
		return planets.size();
	}

	public EnergeticTechnology getEnergeticTechnology() {
		if (energeticTechnology == null)
			energeticTechnology = new EnergeticTechnology();
		return energeticTechnology;
	}

	public void setEnergeticTechnology(EnergeticTechnology energeticTechnology) {
		this.energeticTechnology = energeticTechnology;
	}

	public LaserTechnology getLaserTechnology() {
		if (laserTechnology == null)
			laserTechnology = new LaserTechnology();
		return laserTechnology;
	}

	public void setLaserTechnology(LaserTechnology laserTechnology) {
		this.laserTechnology = laserTechnology;
	}

	public IonTechnology getIonTechnology() {
		if (ionTechnology == null)
			ionTechnology = new IonTechnology();
		return ionTechnology;
	}

	public void setIonTechnology(IonTechnology ionTechnology) {
		this.ionTechnology = ionTechnology;
	}

	public HyperspaceTechnology getHyperspaceTechnology() {
		if (hyperspaceTechnology == null)
			hyperspaceTechnology = new HyperspaceTechnology();
		return hyperspaceTechnology;
	}

	public void setHyperspaceTechnology(HyperspaceTechnology hyperspaceTechnology) {
		this.hyperspaceTechnology = hyperspaceTechnology;
	}

	public PlasmaTechnology getPlasmaTechnology() {
		if (plasmaTechnology == null)
			plasmaTechnology = new PlasmaTechnology();
		return plasmaTechnology;
	}

	public void setPlasmaTechnology(PlasmaTechnology plasmaTechnology) {
		this.plasmaTechnology = plasmaTechnology;
	}

	public SteamEngine getSteamEngine() {
		if (steamEngine == null)
			steamEngine = new SteamEngine();
		return steamEngine;
	}

	public void setSteamEngine(SteamEngine steamEngine) {
		this.steamEngine = steamEngine;
	}

	public ImpulseEngine getImpulseEngine() {
		if (impulseEngine == null)
			impulseEngine = new ImpulseEngine();
		return impulseEngine;
	}

	public void setImpulseEngine(ImpulseEngine impulseEngine) {
		this.impulseEngine = impulseEngine;
	}

	public HyperspaceEngine getHyperspaceEngine() {
		if (hyperspaceEngine == null)
			hyperspaceEngine = new HyperspaceEngine();
		return hyperspaceEngine;
	}

	public void setHyperspaceEngine(HyperspaceEngine hyperspaceEngine) {
		this.hyperspaceEngine = hyperspaceEngine;
	}

	public SpyTechnology getSpyTechnology() {
		if (spyTechnology == null)
			spyTechnology = new SpyTechnology();
		return spyTechnology;
	}

	public void setSpyTechnology(SpyTechnology spyTechnology) {
		this.spyTechnology = spyTechnology;
	}

	public ComputerTechnology getComputerTechnology() {
		if (computerTechnology == null)
			computerTechnology = new ComputerTechnology();
		return computerTechnology;
	}

	public void setComputerTechnology(ComputerTechnology computerTechnology) {
		this.computerTechnology = computerTechnology;
	}

	public Astrophysics getAstrophysics() {
		if (astrophysics == null)
			astrophysics = new Astrophysics();
		return astrophysics;
	}

	public void setAstrophysics(Astrophysics astrophysics) {
		this.astrophysics = astrophysics;
	}

	public IntergalacticResearchNetwork getIntergalacticResearchNetwork() {
		if (intergalacticResearchNetwork == null)
			intergalacticResearchNetwork = new IntergalacticResearchNetwork();
		return intergalacticResearchNetwork;
	}

	public void setIntergalacticResearchNetwork(
			IntergalacticResearchNetwork intergalacticResearchNetwork) {
		this.intergalacticResearchNetwork = intergalacticResearchNetwork;
	}

	public GravitonTechnology getGravitonTechnology() {
		if (gravitonTechnology == null)
			gravitonTechnology = new GravitonTechnology();
		return gravitonTechnology;
	}

	public void setGravitonTechnology(GravitonTechnology gravitonTechnology) {
		this.gravitonTechnology = gravitonTechnology;
	}

	public AttackTechnology getAttackTechnology() {
		if (attackTechnology == null)
			attackTechnology = new AttackTechnology();
		return attackTechnology;
	}

	public void setAttackTechnology(AttackTechnology attackTechnology) {
		this.attackTechnology = attackTechnology;
	}

	public ShieldTechnology getShieldTechnology() {
		if (shieldTechnology == null)
			shieldTechnology = new ShieldTechnology();
		return shieldTechnology;
	}

	public void setShieldTechnology(ShieldTechnology shieldTechnology) {
		this.shieldTechnology = shieldTechnology;
	}

	public ArmourTechnology getArmourTechnology() {
		if (armourTechnology == null)
			armourTechnology = new ArmourTechnology();
		return armourTechnology;
	}

	public void setArmourTechnology(ArmourTechnology armourTechnology) {
		this.armourTechnology = armourTechnology;
	}
	
	
	// TODO Adam Puchalski - Apr 10, 2012 - how to solve problem with earlier galaxy findings - farms, and so one
	// TODO Adam Puchalski - Apr 17, 2012 - a generic ToString would be helpfull here
}
