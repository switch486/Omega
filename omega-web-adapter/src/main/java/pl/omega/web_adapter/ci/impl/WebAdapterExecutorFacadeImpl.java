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
		Command c = new CommandBuilder().getLogInCommand();
		c.proposeArguments(sessionData);
		ExecutedCommand result = new CommandExecutor().executeCommand (c);
		failWhenExceptionsAppeared (result);
		updateSessionData(sessionData, result);
	}

	public ExecutedCommand executeCommand(SessionData sessionData, OmegaPage pageToView, Properties properties) {
		Command c = new CommandBuilder().getStandardCommand();
		c.proposeArguments(sessionData);
		return new CommandExecutor().executeCommand (c);
	}
	
	private void updateSessionData(SessionData sessionData,
			ExecutedCommand result) {
		sessionData.setSessionID(result.getSessionIDFromLogInCommand());
	}
	
	private void failWhenExceptionsAppeared(ExecutedCommand result) {
		if (result.containsExceptions()) 
			throw new RuntimeException(result.getExceptions());
	}

}
