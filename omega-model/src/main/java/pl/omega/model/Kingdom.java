package pl.omega.model;

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

	private List<Planet> planets;
	
	private Map<Coordinates, Planet> neighbourMap;
	
	private long antimateria;
	
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

	public void setUniversumSpeed(int universumSpeed) {
		this.universumSpeed = universumSpeed;
	}
	
	
	// TODO Adam Puchalski - Apr 10, 2012 - how to solve problem with earlier galaxy findings - farms, and so one
	// TODO Adam Puchalski - Apr 17, 2012 - a generic ToString would be helpfull here
}
