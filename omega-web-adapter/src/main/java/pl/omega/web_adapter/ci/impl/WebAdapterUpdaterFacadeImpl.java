package pl.omega.web_adapter.ci.impl;

import org.htmlcleaner.TagNode;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import pl.omega.model.Kingdom;
import pl.omega.model.OmegaPage;
import pl.omega.model.Properties;
import pl.omega.model.SessionData;
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
	// TODO Adam Puchalski - Apr 4, 2012 - a hierarchy would be useful here - so the executor and updater have the same base class.
	
	private WebSessionData webSessionData;

	public void setWebSessionData(WebSessionData webSessionData) {
		this.webSessionData = webSessionData;
	}

	public Kingdom loadKingdom(SessionData sessionData) {
		// TODO Marek Puchalski - Apr 7, 2012 - this should be reworked!
		if (webSessionData != null && webSessionData.getWebDriver() == null) {
			webSessionData.setWebDriver(new HtmlUnitDriver());
		}
		// Update resources for one planet
		Command c = new CommandBuilder().getStandardCommand();
		c.setArguments(sessionData, OmegaPage.OVERVIEW, new Properties());
		ExecutedCommand result = executeCommand(c, true);
		// TODO Adam Puchalski - Apr 17, 2012 - is the result page needed somewhere else?
		return initAllData(result.getRoot(),result.getOutputBody(), OmegaPage.OVERVIEW);
	}

	private Kingdom initAllData(TagNode root, String pageBody, OmegaPage omegaPage) {
		Kingdom k = new Kingdom();
		return updateAllData(k, root, pageBody, omegaPage);
	}

	private Kingdom updateAllData(Kingdom k, TagNode root, String pageBody, OmegaPage omegaPage) {
		return new XPathKingdomDataLoader().updateKingdom(k, root, pageBody, omegaPage);
	}

	private ExecutedCommand executeCommand(Command c, boolean reloginIfExecutionFails) {
		if (reloginIfExecutionFails) {
			try {
				return new CommandExecutor().executeCommand (webSessionData, c);
			} catch(NoSessionException e) {
				new CommandExecutor().executeCommand(webSessionData, new CommandBuilder().getLogInCommand().storeArguments(c.getSessionData()).proposeArguments());
			}
		}
		return new CommandExecutor().executeCommand(webSessionData, c);
	}

	public void updateFlights() {
		// TODO Auto-generated method stub
	}

	public void updateBuildings() {
		// TODO Auto-generated method stub
	}

	public void updatePlanets() {
		// TODO Auto-generated method stub
	}
	
}
