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
		Kingdom loadEDKingdom = w.loadKingdom(sessionData);

		int speed = loadEDKingdom.getUniversumSpeed();
		System.out.println("uni1speed = " + speed);
		
//		System.out.println(sessionData);
	}

}
