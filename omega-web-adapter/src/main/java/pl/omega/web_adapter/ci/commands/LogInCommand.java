package pl.omega.web_adapter.ci.commands;

import java.text.MessageFormat;

import pl.omega.model.OmegaPage;
import pl.omega.model.Properties;
import pl.omega.model.SessionData;
import pl.omega.web_adapter.util.Command;

public class LogInCommand extends Command {

	public LogInCommand() {

		// http://uni1.ogame.pl/game/reg/login2.php?is_utf8=0&login=UczeSie&pass=calineczka
		// http://UNIVERSUM.DOMAIN/game/reg/login2.php?is_utf8=0&login=LOGIN&pass=PASSWORD
	}

	@Override
	public Command buildCommand() {
		// TODO Adam Puchalski - Mar 27, 2012 - in case something is not working properly, please test also:
//		String test = String.format("test goes here %s more text", "Testing");
		
		command = "http://{0}.{1}/game/reg/login2.php?is_utf8=0&login={2}&pass={3}";
		return this;
	}

	@Override
	public void proposeArguments(SessionData sessionData, OmegaPage pageToView,
			Properties properties) {
		commandWithArgs = MessageFormat.format(command,
				sessionData.getUniversum(), sessionData.getDomain(),
				sessionData.getLogInName(), sessionData.getPassword());
	}

}
