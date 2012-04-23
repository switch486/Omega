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
	
	
	// TODO Adam Puchalski - Apr 10, 2012 - how to solve problem with earlier galaxy findings - farms, and so one
	// TODO Adam Puchalski - Apr 17, 2012 - a generic ToString would be helpfull here
}
