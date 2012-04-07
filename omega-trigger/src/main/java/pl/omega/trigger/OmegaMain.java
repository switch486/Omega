package pl.omega.trigger;

import org.apache.log4j.Logger;

import pl.omega.common.util.LoggerFactory;
import pl.omega.common.util.OmegaRegistry;
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
		Trigger trigger = OmegaRegistry.getBean(Trigger.class);
		trigger.run();
	}

}
