package pl.omega.web_adapter.ci;

/**
 * This class holds all operations used to fetch information from the 0game web page.
 * The operations do not perform any actions like building, sending fleet or similar. They only
 * fetch data to update the model. 
 *
 * @author Marek Puchalski
 */
public interface WebAdapterUpdaterFacade {

	/**
	 * This operation updates the resources amount for every planet.
	 */
	void updateResources();
}
