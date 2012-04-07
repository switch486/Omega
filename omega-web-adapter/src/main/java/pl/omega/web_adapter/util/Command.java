package pl.omega.web_adapter.util;

import pl.omega.model.Properties;
import pl.omega.model.SessionData;

public abstract class Command {
	
	protected SessionData sessionData = null;
	protected String omegaPageToView = null;
	protected Properties properties = null;
	
	protected String command;
	protected String commandWithArgs;

	public SessionData getSessionData() {
		return sessionData;
	}

	public String getOmegaPageToView() {
		return omegaPageToView;
	}

	public Properties getProperties() {
		return properties;
	}

	public abstract Command buildCommand ();
	
	public Command storeArguments(SessionData sessionData) {
		return setArguments(sessionData, null, null);
	}
	
	public Command setArguments(SessionData sessionData, String omegaPageToView, Properties properties) {
		this.sessionData = sessionData;
		this.omegaPageToView = omegaPageToView;
		this.properties = properties;
		return this;
	}
	
	public abstract Command proposeArguments ();
	
	public String getURL() {
		// TODO Adam Puchalski - Apr 4, 2012 - TO rework here! propose should be done somewhere else
		proposeArguments();
		return commandWithArgs;
	}
	
}
