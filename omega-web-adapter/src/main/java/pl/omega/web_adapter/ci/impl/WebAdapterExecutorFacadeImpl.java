package pl.omega.web_adapter.ci.impl;


import pl.omega.model.OmegaPage;
import pl.omega.model.Properties;
import pl.omega.model.SessionData;
import pl.omega.web_adapter.ci.Command;
import pl.omega.web_adapter.ci.WebAdapterExecutorFacade;
import pl.omega.web_adapter.ci.commands.ExecutedCommand;
import pl.omega.web_adapter.ci.commands.impl.CommandBuilder;
import pl.omega.web_adapter.ci.commands.impl.CommandExecutor;

/**
 * Executor facade implementation.
 * 
 * @author Adam Puchalski
 */
public class WebAdapterExecutorFacadeImpl implements WebAdapterExecutorFacade {

	public void logIn(SessionData sessionData) {
		Command c = CommandBuilder.getInstance().getLogInCommand();
		c.proposeArguments(sessionData);
		ExecutedCommand result = CommandExecutor.getInstance().executeCommand (c);
		updateSessionData(sessionData, result);
	}

	public void executeCommand(SessionData sessionData, OmegaPage pageToView, Properties properties) {
		Command c = CommandBuilder.getInstance().getStandardCommand();
		c.proposeArguments(sessionData);
		ExecutedCommand result = CommandExecutor.getInstance().executeCommand (c);
	}
	
	private void updateSessionData(SessionData sessionData,
			ExecutedCommand result) {
		sessionData.setSessionID(result.getSessionIDFromLogInCommand());
	}

}
