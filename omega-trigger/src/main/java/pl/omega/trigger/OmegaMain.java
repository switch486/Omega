package pl.omega.trigger;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.omega.common.util.LoggerFactory;
import pl.omega.trigger.ci.Trigger;

/**
 * Main class for starting the application.
 *
 * @author Marek Puchalski
 */
public class OmegaMain {

	private static final Logger log = LoggerFactory.create();

	public static void main(String[] args) {
		log.info("Starting application...");
		ApplicationContext context =
	    	  new ClassPathXmlApplicationContext(new String[] {"omega-trigger-spring.xml"});
		Trigger trigger = context.getBean(Trigger.class);
		trigger.run();
	}

}
