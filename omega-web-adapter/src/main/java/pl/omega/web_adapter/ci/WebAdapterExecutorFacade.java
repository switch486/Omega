package pl.omega.web_adapter.ci;

/**
 * This class holds all operations used to execute commands on the 0game web page.
 * See {@link WebAdapterUpdaterFacade} for fetching commands.
 *
 * @author Adam Puchalski
 */
public interface WebAdapterExecutorFacade {

	/**
	 * This operation logs into one 0game account.
	 */
	void logIn();
	
}
