package pl.omega.web_adapter.ci;

import pl.omega.model.OmegaPage;
import pl.omega.model.Properties;
import pl.omega.model.SessionData;

/**
 * This class holds all operations used to execute commands on the 0game web page.
 * See {@link WebAdapterUpdaterFacade} for fetching commands.
 *
 * @author Adam Puchalski
 */
public interface WebAdapterExecutorFacade {

	/**
	 * This operation logs into one 0game account.
	 * 
	 * @param sessionData
	 *            - contain the {@link SessionData#logInName},
	 *            {@link SessionData#password} and {@link SessionData#universum}
	 *            . After a successful connection the
	 *            {@link SessionData#sessionID} will be recomputed.
	 */
	void logIn(SessionData sessionData);
	
	/**
	 * This executes a command on the 0game website.
	 * @param pageToView
	 * 
	 */
	// TODO Adam Puchalski - Mar 23, 2012 - description to be provided.
	void executeCommand(SessionData sessionData, OmegaPage pageToView, Properties properties);
	
}
