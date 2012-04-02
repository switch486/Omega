package pl.omega.web_adapter.ci.commands.impl;

import pl.omega.web_adapter.ci.commands.LogInCommand;
import pl.omega.web_adapter.ci.commands.StandardCommand;
import pl.omega.web_adapter.util.Command;

public class CommandBuilder {

	public Command getLogInCommand() {
		return new LogInCommand().buildCommand();
	}

	public Command getStandardCommand() {
		return new StandardCommand().buildCommand();
	}
	
}
