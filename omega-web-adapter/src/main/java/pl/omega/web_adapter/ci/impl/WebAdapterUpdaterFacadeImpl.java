package pl.omega.web_adapter.ci.impl;

import org.htmlcleaner.TagNode;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import pl.omega.model.Kingdom;
import pl.omega.model.OmegaPage;
import pl.omega.model.Planet;
import pl.omega.model.Properties;
import pl.omega.model.SessionData;
import pl.omega.web_adapter.ci.Strategy;
import pl.omega.web_adapter.ci.WebAdapterUpdaterFacade;
import pl.omega.web_adapter.ci.commands.ExecutedCommand;
import pl.omega.web_adapter.ci.commands.impl.CommandBuilder;
import pl.omega.web_adapter.ci.commands.impl.CommandExecutor;
import pl.omega.web_adapter.ci.xpaths.XPathKingdomDataLoader;
import pl.omega.web_adapter.data.WebSessionData;
import pl.omega.web_adapter.util.Command;

/**
 * Updater facade implementation.
 * 
 * @author Adam Puchalski
 */
public class WebAdapterUpdaterFacadeImpl implements WebAdapterUpdaterFacade {
	// TODO Adam Puchalski - Apr 4, 2012 - a hierarchy would be useful here - so
	// the executor and updater have the same base class.

	private WebSessionData webSessionData;

	public void setWebSessionData(WebSessionData webSessionData) {
		this.webSessionData = webSessionData;
	}

	public Kingdom loadKingdom(SessionData sessionData, Strategy strategy) {
		initWebDriver();
		
		Kingdom kingdom = updateOverviewPage(sessionData, null, null, strategy);
		if (strategy == Strategy.ROOT) {
			return kingdom;
		}
		
		updateRestForPlanet(sessionData, kingdom, kingdom.getHomePlanet(), strategy);
		
		if (strategy == Strategy.SINGLE) {
			return kingdom;
		}
		
		for (int i=0; i<kingdom.getPlanetCount(); i++) {
			updateRestForPlanet(sessionData, kingdom, kingdom.getPlanet(i), strategy);
		} 
		
		if (strategy == Strategy.EAGER) {
			return kingdom;
		}
		
		// else needed?
		return null;
	}

	public Kingdom updateOmegaPage(SessionData sessionData, Kingdom kingdom, Planet planet, OmegaPage page, Strategy strategy) {
		ExecutedCommand result = webGetOmegaPage(sessionData, page,
				new Properties());
		if (kingdom == null) {
			return initAllData(result.getRoot(), result.getOutputBody(),
					page, strategy);
		}
		return updateAllData(kingdom, planet, result.getRoot(), result.getOutputBody(), page, strategy);
	}

	public Kingdom updateResourcesPage(SessionData sessionData,
			Kingdom kingdom, Planet planet, Strategy strategy) {
		return updateOmegaPage(sessionData, kingdom, planet,
				OmegaPage.RESOURCES, strategy);
	}

	public Kingdom updateOverviewPage(SessionData sessionData, Kingdom kingdom,
			Planet planet, Strategy strategy) {
		return updateOmegaPage(sessionData, kingdom, planet, OmegaPage.OVERVIEW, strategy);
	}

	public Kingdom updateStationPage(SessionData sessionData, Kingdom kingdom,
			Planet planet, Strategy strategy) {
		return updateOmegaPage(sessionData, kingdom, planet, OmegaPage.STATION, strategy);
	}

	public Kingdom updateResearchPage(SessionData sessionData, Kingdom kingdom,
			Planet planet, Strategy strategy) {
		return updateOmegaPage(sessionData, kingdom, planet, OmegaPage.RESEARCH, strategy);
	}

	public Kingdom updateShipyardPage(SessionData sessionData, Kingdom kingdom,
			Planet planet, Strategy strategy) {
		return updateOmegaPage(sessionData, kingdom, planet, OmegaPage.SHIPYARD, strategy);
	}

	public Kingdom updateDefensePage(SessionData sessionData, Kingdom kingdom,
			Planet planet, Strategy strategy) {
		return updateOmegaPage(sessionData, kingdom, planet, OmegaPage.DEFENSE, strategy);
	}

	public Kingdom updateFleetPage(SessionData sessionData, Kingdom kingdom,
			Planet planet, Strategy strategy) {
		// TODO Adam Puchalski - Apr 30, 2012 - check if this is still relevant - maybe the dock information will be enough?
//		return updateOmegaPage(sessionData, kingdom, planet, OmegaPage.FLEET1, strategy);
		return kingdom;
	}

	public Kingdom updateGalaxyPage(SessionData sessionData, Kingdom kingdom,
			Planet planet, Strategy strategy) {
		return updateOmegaPage(sessionData, kingdom, planet, OmegaPage.GALAXY, strategy);
	}

	public Kingdom updateAlliancePage(SessionData sessionData, Kingdom kingdom,
			Planet planet, Strategy strategy) {
		return updateOmegaPage(sessionData, kingdom, planet, OmegaPage.ALLIANCE, strategy);
	}
	
	public Kingdom updateGlobalTechTreePage(SessionData sessionData, Kingdom kingdom,
			Planet planet, Strategy strategy) {
		return updateOmegaPage(sessionData, kingdom, planet, OmegaPage.GLOBAL_TECH_TREE, strategy);
	}
	
	public Kingdom updateResourceSettingsPage(SessionData sessionData, Kingdom kingdom,
			Planet planet, Strategy strategy) {
		return updateOmegaPage(sessionData, kingdom, planet, OmegaPage.RESOURCE_SETTINGS, strategy);
	}

	private ExecutedCommand executeCommand(Command c,
			boolean reloginIfExecutionFails) {
		if (reloginIfExecutionFails) {
			try {
				return new CommandExecutor().executeCommand(webSessionData, c);
			} catch (NoSessionException e) {
				new CommandExecutor().executeCommand(
						webSessionData,
						new CommandBuilder().getLogInCommand()
								.storeArguments(c.getSessionData())
								.proposeArguments());
			}
		}
		return new CommandExecutor().executeCommand(webSessionData, c);
	}

	private Kingdom initAllData(TagNode root, String pageBody,
			OmegaPage omegaPage, Strategy strategy) {
		Kingdom k = new Kingdom();
		return updateAllData(k, null, root, pageBody, omegaPage, strategy);
	}

	private Kingdom updateAllData(Kingdom k, Planet p, TagNode root, String pageBody,
			OmegaPage omegaPage, Strategy strategy) {
		return new XPathKingdomDataLoader().updateKingdomInfo(k, p, root, pageBody,
				omegaPage, strategy);
	}

	private void updateRestForPlanet(SessionData sessionData, Kingdom kingdom, Planet planet, Strategy strategy) {
		updateResourcesPage(sessionData, kingdom, planet, strategy);
		updateStationPage(sessionData, kingdom, planet, strategy);
		updateResearchPage(sessionData, kingdom, planet, strategy);
		updateShipyardPage(sessionData, kingdom, planet, strategy);
		updateDefensePage(sessionData, kingdom, planet, strategy);
		updateFleetPage(sessionData, kingdom, planet, strategy);
//		// TODO Adam Puchalski - Apr 24, 2012 - uncomment as soon as the implementation will be ready
		// movement?!
//		updateGalaxyPage(sessionData, kingdom, planet, strategy);
//		updateAlliancePage(sessionData, kingdom, planet, strategy);
//		// TODO Adam Puchalski - Apr 24, 2012 - is the one below really needed?
//		updateGlobalTechTreePage(sessionData, kingdom, planet, strategy);
//		updateResourceSettingsPage(sessionData, kingdom, planet, strategy);
	}

	public void startBuildingSomethingSingle (SessionData sessionData, OmegaPage pageToView, Class clazz) {
		initWebDriver();
		Properties properties;
		properties = new ArgumentsToPropertiesTransformer().transform(pageToView, clazz);
		webGetOmegaPage(sessionData, pageToView, properties);
		// TODO Adam Puchalski - Apr 30, 2012 - remodeling to be done here?
	}

	private void initWebDriver() {
		// TODO Marek Puchalski - Apr 7, 2012 - this should be reworked!
		if (webSessionData != null && webSessionData.getWebDriver() == null) {
			webSessionData.setWebDriver(new HtmlUnitDriver());
		}
	}
	
	private ExecutedCommand webGetOmegaPage(SessionData sessionData,
			OmegaPage pageToView, Properties properties) {
		Command c = new CommandBuilder().getStandardCommand();
		c.setArguments(sessionData, pageToView, properties);
		ExecutedCommand result = executeCommand(c, true);
		return result;
	}

}
