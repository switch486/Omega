package pl.omega.web_adapter.ci.commands;

import java.util.ArrayList;
import java.util.List;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;

import pl.omega.web_adapter.util.Command;

public class ExecutedCommand {

	Command inputCommand;
	String outputBody;
	List<Exception> exceptionsOccured;
	TagNode node;
	
	private final HtmlCleaner htmlCleaner;

	public ExecutedCommand(Command c) {
		inputCommand = c;
		exceptionsOccured = new ArrayList<Exception>();
		htmlCleaner = new HtmlCleaner();
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

	/**
	 * Will also execute cleanOutputBody()
	 */
	public void setOutputBody(String s) {
		outputBody = s;
		cleanOutputBody();
	}

	public void cleanOutputBody() {
		node = htmlCleaner.clean(outputBody);
	}

	public void addException(Exception e) {
		exceptionsOccured.add(e);
	}

	public String getOutputBody () {
		return outputBody;
	}
	
	public TagNode getRoot() {
		return node;
	}
	
}
