package pl.omega.web_adapter.ci;

import pl.omega.model.SessionData;

/**
 * This class holds all operations used to fetch information from the 0game web page.
 * The operations do not perform any actions like building, sending fleet or similar. They only
 * fetch data to update the model. 
 *
 * @author Marek Puchalski
 */
public interface WebAdapterUpdaterFacade {
	// TODO Adam Puchalski - Mar 23, 2012 - how too solve problem of refreshing resources having more than one planet

	/**
	 * This operation updates the resources amount for one planet first (don't
	 * know about the rest at the moment).
	 * 
	 * @param sessionData
	 */
	void updateResources(SessionData sessionData);
	
	void updateFlights();
	
	void updateBuildings();
}
