package pl.omega.web_adapter.ci.commands;

import pl.omega.web_adapter.ci.Command;


public class ExecutedCommand {

	Command inputCommand;
	// TODO Adam Puchalski - Mar 27, 2012 - cookies and other stuff
//	Cookie[] initcookies;
	
	public Command getInputCommand() {
		return inputCommand;
	}
	
	public String getSessionIDFromLogInCommand() {
		if (inputCommand instanceof LogInCommand) {
			// TODO Adam Puchalski - Mar 27, 2012 - 
			
			return null;
		}
		else {
			throw new IllegalStateException ("InputCommand is not an instance of the LogInCommand!");
		}
	}

}
