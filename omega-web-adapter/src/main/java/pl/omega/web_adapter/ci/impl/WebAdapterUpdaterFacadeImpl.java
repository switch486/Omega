package pl.omega.web_adapter.ci.impl;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import pl.omega.model.OmegaPage;
import pl.omega.model.Properties;
import pl.omega.model.SessionData;
import pl.omega.web_adapter.ci.WebAdapterUpdaterFacade;
import pl.omega.web_adapter.ci.commands.ExecutedCommand;
import pl.omega.web_adapter.ci.commands.impl.CommandBuilder;
import pl.omega.web_adapter.ci.commands.impl.CommandExecutor;
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

	public void updateResources(SessionData sessionData) {
		// TODO Marek Puchalski - Apr 7, 2012 - this should be reworked!
		if (webSessionData != null && webSessionData.getWebDriver() == null) {
			webSessionData.setWebDriver(new HtmlUnitDriver());
		}
		// Update resources for one planet
		Command c = new CommandBuilder().getStandardCommand();
		c.setArguments(sessionData, OmegaPage.OVERVIEW, new Properties());
		ExecutedCommand result = executeCommand(c, true);
		System.out.println(result.getOutputBody());
	}

	private ExecutedCommand executeCommand(Command c, boolean reloginIfExecutionFails) {
		if (reloginIfExecutionFails) {
			ExecutedCommand executeCommand = null;
			try {
				executeCommand = new CommandExecutor().executeCommand (webSessionData, c);
				if (executeCommand.containsExceptions()){
					// TODO Adam Puchalski - Apr 4, 2012 - 
					throw new NoSessionException();
				}
				// TODO Adam Puchalski - Apr 7, 2012 - remofe the throws so it can be normally used!
				throw new NoSessionException();
			} catch(Throwable e) {
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
	
}
