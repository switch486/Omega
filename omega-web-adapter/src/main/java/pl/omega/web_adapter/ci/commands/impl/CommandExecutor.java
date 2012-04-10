package pl.omega.web_adapter.ci.commands.impl;

import pl.omega.web_adapter.ci.commands.ExecutedCommand;
import pl.omega.web_adapter.ci.impl.NoSessionException;
import pl.omega.web_adapter.data.WebSessionData;
import pl.omega.web_adapter.util.Command;

public class CommandExecutor {

	private static final String INVALID_WEB_PAGE = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<html>\n  <head>\n    <script>\n//<![CDATA[\ndocument.location.href='http://ogame.pl'\n//]]>\n    </script>\n  </head>\n  <body/>\n</html>\n";

	public ExecutedCommand executeCommand(WebSessionData webSessionData,
			Command c) {
		ExecutedCommand result = new ExecutedCommand(c);
		// TODO logging in here would be nice!
		webSessionData.getWebDriver().get(c.getURL());

		result.setOutputBody(webSessionData.getWebDriver().getPageSource());

		if (isValidWebPage(result.getOutputBody())) {
			return result;
		}
		throw new NoSessionException();
	}

	private boolean isValidWebPage(String outputBody) {
		return !outputBody.startsWith(INVALID_WEB_PAGE);
	}

}
