package pl.omega.web_adapter.ci.commands.impl;

import pl.omega.web_adapter.ci.commands.ExecutedCommand;
import pl.omega.web_adapter.data.WebSessionData;
import pl.omega.web_adapter.util.Command;

public class CommandExecutor {

	public ExecutedCommand executeCommand(WebSessionData webSessionData, Command c) {
		ExecutedCommand result = new ExecutedCommand(c);
		
		//TODO logging in here would be nice!

		webSessionData.getWebDriver().get(c.getURL());

        result.setOutputBody(webSessionData.getWebDriver().getPageSource());
        // TODO Adam Puchalski - Apr 4, 2012 - because the Session Data is available here, maybe we can update it here too.
        // TODO Adam Puchalski - Apr 4, 2012 - seems like an notmal execution statement can also browse existing cookies, so the login action does not to be triggered everytime
		
		return result;
	}
	
}
