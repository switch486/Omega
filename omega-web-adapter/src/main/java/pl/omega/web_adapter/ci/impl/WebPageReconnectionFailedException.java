package pl.omega.web_adapter.ci.impl;

import pl.omega.web_adapter.ci.commands.ExecutedCommand;

public class WebPageReconnectionFailedException extends RuntimeException {

	private final int maxCount;
	private final ExecutedCommand command;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WebPageReconnectionFailedException(int maxCount, ExecutedCommand command) {
		this.maxCount = maxCount;
		this.command = command;
	}

}
