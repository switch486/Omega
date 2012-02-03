package pl.omega.trigger;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.omega.common.util.LoggerFactory;
import pl.omega.logic.ci.LogicFacade;
import pl.omega.logic.ci.impl.LogicFacadeImpl;

/**
 * Main class for starting the application.
 *
 * @author Marek Puchalski
 */
public class OmegaMain {
	
	private static final Logger log = LoggerFactory.create();

	private LogicFacade logicFacade;

	public static void main(String[] args) {
		log.info("Starting application...");
		ApplicationContext context = 
	    	  new ClassPathXmlApplicationContext(new String[] {"omega-trigger-spring.xml"});
		System.out.println(context.getBean(LogicFacadeImpl.class));
	}

	// spring setters
	
	@Autowired
	public void setLogicFacade(LogicFacade logicFacade) {
		this.logicFacade = logicFacade;
	}
	
}
