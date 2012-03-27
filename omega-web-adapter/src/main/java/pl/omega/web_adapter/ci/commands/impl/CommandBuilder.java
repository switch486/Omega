package pl.omega.web_adapter.ci.commands.impl;

import pl.omega.web_adapter.ci.Command;
import pl.omega.web_adapter.ci.commands.LogInCommand;
import pl.omega.web_adapter.ci.commands.StandardCommand;

public class CommandBuilder {
	// TODO Adam Puchalski - Mar 27, 2012 - to be reworked to something better like injects! in different parts of code!
	
	static CommandBuilder instance;
	
	static {
		instance = new CommandBuilder();
	}
	
	private CommandBuilder() {
		
	}

	@Deprecated
	public static CommandBuilder getInstance() {
		return instance;
	}
	
	public Command getLogInCommand() {
		return new LogInCommand().buildCommand();
	}

	public Command getStandardCommand() {
		return new StandardCommand().buildCommand();
	}
	
}
