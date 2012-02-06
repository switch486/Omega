package pl.omega.trigger.ci.impl;

import org.apache.log4j.Logger;

import pl.omega.common.util.LoggerFactory;
import pl.omega.logic.ci.LogicFacade;
import pl.omega.trigger.ci.Trigger;

public class TriggerImpl implements Trigger {

	private static final Logger log = LoggerFactory.create();
	private LogicFacade logicFacade;

	public void run() {
		// Lets do one call only for now
		log.debug("Performing logics one run");
		logicFacade.run();
	}

	// spring setters

	public void setLogicFacade(LogicFacade logicFacade) {
		this.logicFacade = logicFacade;
	}
}
