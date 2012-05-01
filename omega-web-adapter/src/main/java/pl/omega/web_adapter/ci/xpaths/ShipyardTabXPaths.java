package pl.omega.web_adapter.ci.xpaths;

import pl.omega.model.objects.BigTransporter;
import pl.omega.model.objects.Bomber;
import pl.omega.model.objects.Colonizator;
import pl.omega.model.objects.Cruiser;
import pl.omega.model.objects.DeathStar;
import pl.omega.model.objects.Destroyer;
import pl.omega.model.objects.HeavyFighter;
import pl.omega.model.objects.LightFighter;
import pl.omega.model.objects.Panzer;
import pl.omega.model.objects.Recycler;
import pl.omega.model.objects.SmallTransporter;
import pl.omega.model.objects.SolarSatelit;
import pl.omega.model.objects.SpyingSond;
import pl.omega.model.objects.WarHorse;

public class ShipyardTabXPaths extends AbstractXPaths {
	
	private static final String shipyardMilitaryKeyword = "military";
	private static final String shipyardCivilKeyword = "civil";

	public static final String shipyardLightFighterXPath     = getShipyardMilitaryXPathWith(new LightFighter().referenceID);
	public static final String shipyardHeavyFighterXPath     = getShipyardMilitaryXPathWith(new HeavyFighter().referenceID);
	public static final String shipyardCruiserXPath          = getShipyardMilitaryXPathWith(new Cruiser().referenceID);
	public static final String shipyardWarHorseXPath         = getShipyardMilitaryXPathWith(new WarHorse().referenceID);
	public static final String shipyardPanzerXPath           = getShipyardMilitaryXPathWith(new Panzer().referenceID);
	public static final String shipyardBomberXPath           = getShipyardMilitaryXPathWith(new Bomber().referenceID);
	public static final String shipyardDestroyerXPath        = getShipyardMilitaryXPathWith(new Destroyer().referenceID);
	public static final String shipyardDeathStarXPath        = getShipyardMilitaryXPathWith(new DeathStar().referenceID);

	public static final String shipyardSmallTransporterXPath = getShipyardCivilXPathWith(new SmallTransporter().referenceID);
	public static final String shipyardBigTransporterXPath   = getShipyardCivilXPathWith(new BigTransporter().referenceID);
	public static final String shipyardColonizatorXPath      = getShipyardCivilXPathWith(new Colonizator().referenceID);
	public static final String shipyardRecyclerXPath         = getShipyardCivilXPathWith(new Recycler().referenceID);
	public static final String shipyardSpyingSondXPath       = getShipyardCivilXPathWith(new SpyingSond().referenceID);
	public static final String shipyardSolarSatelitXPath     = getShipyardCivilXPathWith(new SolarSatelit().referenceID);

	private static String getShipyardMilitaryXPathWith(int referenceID) {
		return getStandardXPathWith(shipyardMilitaryKeyword + referenceID);
	}
	
	private static String getShipyardCivilXPathWith(int referenceID) {
		return getStandardXPathWith(shipyardCivilKeyword + referenceID);
	}

}
