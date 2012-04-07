package pl.omega.logic.ci.impl;

import org.apache.log4j.Logger;

import pl.omega.common.util.LoggerFactory;
import pl.omega.logic.ci.LogicFacade;
import pl.omega.logic.ci.LogicRunResultTO;
import pl.omega.model.SessionData;
import pl.omega.web_adapter.ci.WebAdapterUpdaterFacade;

public class LogicFacadeImpl implements LogicFacade {

	private static final Logger log = LoggerFactory.create();
	private WebAdapterUpdaterFacade waUpdaterFacade;

	public LogicRunResultTO run() {
		log.debug("Logics entry point reached.");
		SessionData sessionData = new SessionData("UczeSie", "calineczka", "uni1", "ogame.pl");
		waUpdaterFacade.updateResources(sessionData);
		return new LogicRunResultTO();
	}

	// spring setters

	public void setWaUpdaterFacade(WebAdapterUpdaterFacade waUpdaterFacade) {
		this.waUpdaterFacade = waUpdaterFacade;
	}

}
