package pl.omega.web_adapter.ci;

import pl.omega.model.Kingdom;
import pl.omega.model.OmegaPage;
import pl.omega.model.Planet;
import pl.omega.model.SessionData;

/**
 * This class holds all operations used to fetch information from the 0game web
 * page. The operations do not perform any actions like building, sending fleet
 * or similar. They only fetch data to update the model.
 * 
 * @author Marek Puchalski
 */
public interface WebAdapterUpdaterFacade {

	/**
	 * This operation loads all the needed information from the webPage. All planets, buildings on them, ...
	 * This shall be executed only once if the application logs in! At this moment noone knows about the planet count, available resources, ...
	 * 
	 * @param sessionData
	 * @return 
	 */
	Kingdom loadKingdom(SessionData sessionData, Strategy strategy);

	Kingdom updateOverviewPage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);

	Kingdom updateResourcesPage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);
	
	Kingdom updateStationPage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);
	
	Kingdom updateResearchPage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);
	
	Kingdom updateShipyardPage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);
	
	Kingdom updateDefensePage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);
	
	Kingdom updateFleetPage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);
	
	Kingdom updateGalaxyPage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);
	
	Kingdom updateAlliancePage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);
	
	Kingdom updateGlobalTechTreePage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);
	
	Kingdom updateResourceSettingsPage(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy);
	
	Kingdom updateOmegaPage(SessionData sessionData, Kingdom kingdom, Planet planet, OmegaPage page, Strategy strategy);
	
	void startBuildingSomethingSingle (SessionData sessionData, OmegaPage pageToView, Class clazz);
}
