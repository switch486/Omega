package pl.omega.web_adapter.ci;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.omega.common.util.LoggerFactory;
import pl.omega.model.SessionData;
import pl.omega.web_adapter.ci.impl.WebAdapterUpdaterFacadeImpl;

public class App {

	private static final Logger log = LoggerFactory.create();

	public static void main(String[] args) {
		log.info("Starting application...");
		ApplicationContext context =
	    	  new ClassPathXmlApplicationContext(new String[] {"omega-web-adapter-spring.xml"});
		WebAdapterUpdaterFacade w = context.getBean(WebAdapterUpdaterFacadeImpl.class);
		
		SessionData sessionData = new SessionData("UczeSie", "calineczka", "uni1", "ogame.pl");
		w.updateResources(sessionData);
		
		System.out.println(sessionData);
	}
	
}
