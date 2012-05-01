package pl.omega.web_adapter.ci.xpaths;

import pl.omega.model.objects.AntiRocket;
import pl.omega.model.objects.BigShield;
import pl.omega.model.objects.GaussGun;
import pl.omega.model.objects.HeavyLaserGun;
import pl.omega.model.objects.InterPlanetarRocket;
import pl.omega.model.objects.IonGun;
import pl.omega.model.objects.LightLaserGun;
import pl.omega.model.objects.LittleShield;
import pl.omega.model.objects.PlasmaGun;
import pl.omega.model.objects.RocketThrower;


public class DefenceTabXPaths extends AbstractXPaths {
	
	private static final String defencePageKeyword = "defense";

	public static final String defenceRocketThrowerXPath       = getdefenceXPathWith(new RocketThrower().referenceID);
	public static final String defenceLightLaserGunXPath       = getdefenceXPathWith(new LightLaserGun().referenceID);
	public static final String defenceHeavyLaserGunXPath       = getdefenceXPathWith(new HeavyLaserGun().referenceID);
	public static final String defenceGaussGunXPath            = getdefenceXPathWith(new GaussGun().referenceID);
	public static final String defenceIonGunXPath              = getdefenceXPathWith(new IonGun().referenceID);
	public static final String defencePlasmaGunXPath           = getdefenceXPathWith(new PlasmaGun().referenceID);
	public static final String defenceLittleShieldXPath        = getdefenceXPathWith(new LittleShield().referenceID);
	public static final String defenceBigShieldXPath           = getdefenceXPathWith(new BigShield().referenceID);
	public static final String defenceAntiRocketXPath          = getdefenceXPathWith(new AntiRocket().referenceID);
	public static final String defenceInterPlanetarRocketXPath = getdefenceXPathWith(new InterPlanetarRocket().referenceID);

	protected static String getdefenceXPathWith(int referenceID) {
		return getStandardXPathWith(defencePageKeyword + referenceID);
	}

}
