package pl.omega.web_adapter.ci.commands.impl;

import pl.omega.web_adapter.ci.commands.ExecutedCommand;
import pl.omega.web_adapter.ci.impl.NoSessionException;
import pl.omega.web_adapter.ci.impl.WebPageReconnectionFailedException;
import pl.omega.web_adapter.data.WebSessionData;
import pl.omega.web_adapter.util.Command;

public class CommandExecutor {

	private static final String INVALID_WEB_PAGE = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<html>\n  <head>\n    <script>\n//<![CDATA[\ndocument.location.href='http://ogame.pl'\n//]]>\n    </script>\n  </head>\n  <body/>\n</html>\n";
	private final int MAX_RECONNECTING_COUNT = 5;

	public ExecutedCommand executeCommand(WebSessionData webSessionData,
			Command c) {
		ExecutedCommand result = new ExecutedCommand(c);
		// TODO logging in here would be nice!
		String pageSource = null;
		int counter = 0;
		do {
			webSessionData.getWebDriver().get(c.getURL());
			// TODO Adam Puchalski - Apr 30, 2012 - is it executed in a different thread or what? it appears, like we can get the previous page sometimes...

			pageSource = webSessionData.getWebDriver().getPageSource();
			counter ++;
			// TODO Adam Puchalski - May 1, 2012 - this does not make sense - the result.getOutputBody is null, because we create the EC from scratch, still there has to be a way to determine how to do it!
		} while (pageSource == result.getOutputBody() && counter < MAX_RECONNECTING_COUNT);
		result.setOutputBody(pageSource);
		
		if (counter>=MAX_RECONNECTING_COUNT) {
			throw new WebPageReconnectionFailedException(MAX_RECONNECTING_COUNT, result);
		}

		if (isValidWebPage(result.getOutputBody())) {
			return result;
		}
		throw new NoSessionException();
	}

	private boolean isValidWebPage(String outputBody) {
		return !outputBody.startsWith(INVALID_WEB_PAGE);
	}

}
