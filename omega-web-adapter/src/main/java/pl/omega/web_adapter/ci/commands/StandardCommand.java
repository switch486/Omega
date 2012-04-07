package pl.omega.web_adapter.ci.commands;

import java.text.MessageFormat;
import java.util.Map.Entry;

import pl.omega.web_adapter.util.Command;

public class StandardCommand extends Command {

	public StandardCommand() {

		// http://uni1.ogame.pl/game/index.php?page=overview&PHPSESSID=11cce29a0999&kid=
		// http://UNI.DOMAIN/game/index.php?page=PAGE&PHPSESSID=SESSIONID&K=V&K=V&K=V
	}

	@Override
	public Command buildCommand() {
		// TODO Adam Puchalski - Mar 27, 2012 - in case something is not working
		// properly, please test also:
		// String test = String.format("test goes here %s more text",
		// "Testing");

		command = "http://{0}.{1}/game/index.php?page={2}";
		return this;
	}

	@Override
	public Command proposeArguments() {
		int size = properties.size();
		StringBuilder sb = new StringBuilder();
		if (size>0) {
			for (Entry<Object, Object> pair : properties.entrySet()) {
				sb.append('&');
				sb.append(pair.getKey().toString());
				sb.append('=');
				sb.append(pair.getValue().toString());
			}
		}
		commandWithArgs = MessageFormat.format(command,
				sessionData.getUniversum(), sessionData.getDomain(),
				omegaPageToView) + sb.toString();
		return this;
	}
}
