package pl.omega.web_adapter.ci.commands.impl;

import pl.omega.web_adapter.ci.Command;
import pl.omega.web_adapter.ci.commands.ExecutedCommand;

public class CommandExecutor {
	// TODO Adam Puchalski - Mar 27, 2012 - to be reworked to something better like injects! in different parts of code!

	static CommandExecutor instance;
	
	static {
		instance = new CommandExecutor();
	}
	
	private CommandExecutor() {
		
	}

	@Deprecated
	public static CommandExecutor getInstance() {
		return instance;
	}
	

	public ExecutedCommand executeCommand(Command c) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
