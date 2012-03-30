package pl.omega.web_adapter.ci.commands;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.Cookie;

import pl.omega.web_adapter.ci.Command;
import pl.omega.web_adapter.ci.Constants;

public class ExecutedCommand {

	Command inputCommand;
	Cookie[] initcookies;
	String outputBody;
	List<Exception> exceptionsOccured;

	public ExecutedCommand(Command c) {
		inputCommand = c;
		exceptionsOccured = new ArrayList<Exception>();
	}
	
	public boolean containsExceptions () {
		return !exceptionsOccured.isEmpty();
	}
	
	public String getExceptions () {
		StringBuilder sb = new StringBuilder();
		
		for (Exception e : exceptionsOccured) {
			sb.append("\n-------------EXCEPTION--------------\n");
			for (StackTraceElement st : e.getStackTrace())
				sb.append(st.toString() + "\n");
		}
		return sb.toString();
	}

	public Command getInputCommand() {
		return inputCommand;
	}

	public void setOutputBody(String s) {
		outputBody = s;
	}

	public void addException(Exception e) {
		exceptionsOccured.add(e);
	}

	public String getSessionIDFromLogInCommand() {
		if (inputCommand instanceof LogInCommand) {
			for (Cookie c : initcookies) {
				String string = c.toString();
				if (string.contains(Constants.PHPSESSID)) {
					return string.split("=")[1];
				}
			}
			throw new IllegalStateException("No " + Constants.PHPSESSID
					+ " found in response Cookies");
		} else {
			throw new IllegalStateException(inputCommand.getClass().getName()
					+ " is not an instance of the "
					+ LogInCommand.class.getName() + "!");
		}
	}

	public void setCookies(Cookie[] cookies) {
		initcookies = cookies;
	}

}
