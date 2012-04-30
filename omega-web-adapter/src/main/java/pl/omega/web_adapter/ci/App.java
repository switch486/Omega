package pl.omega.web_adapter.ci;

import org.apache.log4j.Logger;

import pl.omega.common.util.LoggerFactory;
import pl.omega.common.util.OmegaRegistry;
import pl.omega.model.Kingdom;
import pl.omega.model.SessionData;
import pl.omega.web_adapter.ci.impl.WebAdapterUpdaterFacadeImpl;

public class App {

	private static final Logger log = LoggerFactory.create();

	public static void main(String[] args) {
		log.info("Starting application...");
		OmegaRegistry.init("omega-web-adapter-spring.xml");
		WebAdapterUpdaterFacade w = OmegaRegistry.getBean(WebAdapterUpdaterFacadeImpl.class);

		SessionData sessionData = new SessionData("UczeSie", "calineczka", "uni1", "ogame.pl");
		Kingdom loadedKingdom = w.loadKingdom(sessionData, Strategy.EAGER);

		int speed = loadedKingdom.getUniversumSpeed();
		System.out.println("uni1speed = " + speed);
		System.out.println("m>" + loadedKingdom.getHomePlanet().getResMetal());
		System.out.println("c>" + loadedKingdom.getHomePlanet().getResCristal());
		System.out.println("d>" + loadedKingdom.getHomePlanet().getResDeuterium());
		System.out.println("e>" + loadedKingdom.getHomePlanet().getResEnergy());
		System.out.println("score>" + loadedKingdom.getScore());
		System.out.println("position>" + loadedKingdom.getPositionActuall() + "/" + loadedKingdom.getGamersActuall());
		System.out.println("templow" + loadedKingdom.getHomePlanet().getTemperatureLow());
		System.out.println("tempMax" + loadedKingdom.getHomePlanet().getTemperatureHigh());
		
//		w.startBuildingSomethingSingle(sessionData, OmegaPage.RESOURCES, MetalMine.class);
//		// TODO Adam Puchalski - Apr 30, 2012 - some token needed??!???!?! wtf
//		
//		System.out.println(w);
	}

}
