package pl.omega.web_adapter.ci;

import pl.omega.model.OmegaPage;
import pl.omega.model.Properties;
import pl.omega.model.SessionData;

public abstract class Command {
	
	protected String command;
	protected String commandWithArgs;

	public abstract Command buildCommand ();
	
	public void proposeArguments (SessionData sessionData) {
		proposeArguments(sessionData, null, null);
	}
	
	public abstract void proposeArguments (SessionData sessionData, OmegaPage pageToView, Properties properties);
	
}
