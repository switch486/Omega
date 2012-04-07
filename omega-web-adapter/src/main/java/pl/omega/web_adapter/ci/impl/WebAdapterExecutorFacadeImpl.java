package pl.omega.web_adapter.ci.impl;


import pl.omega.web_adapter.ci.WebAdapterExecutorFacade;
import pl.omega.web_adapter.ci.commands.ExecutedCommand;

/**
 * Executor facade implementation.
 * 
 * @author Adam Puchalski
 */
public class WebAdapterExecutorFacadeImpl implements WebAdapterExecutorFacade {

//	public void logIn(SessionData sessionData) {
//		Command c = new CommandBuilder().getLogInCommand();
//		c.storeArguments(sessionData);
//		ExecutedCommand result = new CommandExecutor().executeCommand (c);
//		failWhenExceptionsAppeared (result);
//	}
//
//	public ExecutedCommand executeCommand(SessionData sessionData, OmegaPage pageToView, Properties properties) {
//		Command c = new CommandBuilder().getStandardCommand();
//		c.storeArguments(sessionData);
//		return new CommandExecutor().executeCommand (c);
//	}
	
	private void failWhenExceptionsAppeared(ExecutedCommand result) {
		if (result.containsExceptions()) 
			throw new RuntimeException(result.getExceptions());
	}

}
