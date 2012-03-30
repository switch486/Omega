package pl.omega.web_adapter.ci.commands.impl;

import pl.omega.web_adapter.ci.Command;
import pl.omega.web_adapter.ci.commands.LogInCommand;
import pl.omega.web_adapter.ci.commands.StandardCommand;

public class CommandBuilder {

	public Command getLogInCommand() {
		return new LogInCommand().buildCommand();
	}

	public Command getStandardCommand() {
		return new StandardCommand().buildCommand();
	}
	
}
