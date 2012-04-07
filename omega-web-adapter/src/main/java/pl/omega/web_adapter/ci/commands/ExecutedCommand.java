package pl.omega.web_adapter.ci.commands;

import java.util.ArrayList;
import java.util.List;

import pl.omega.web_adapter.util.Command;

public class ExecutedCommand {

	Command inputCommand;
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

	public String getOutputBody () {
		return outputBody;
	}
	
}
