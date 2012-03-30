package pl.omega.web_adapter.ci.commands.impl;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import pl.omega.web_adapter.ci.Command;
import pl.omega.web_adapter.ci.commands.ExecutedCommand;

public class CommandExecutor {

	public ExecutedCommand executeCommand(Command c) {
		ExecutedCommand result = new ExecutedCommand(c);
		
		//TODO logging in here would be nice!
		HttpClient client = new HttpClient();
		try {
			client.startSession(new URL("http:\\www.ogame.pl"));
		} catch (MalformedURLException e) {
			result.addException(e);
			return result;
		}

        GetMethod getMethod = new GetMethod(c.getURL());

        try {
			client.executeMethod(getMethod);
		} catch (Exception e) {
			result.addException(e);
			return result;
		} 
        
        result.setOutputBody(getMethod.getResponseBodyAsString());
        result.setCookies(client.getState().getCookies());
		
		return result;
	}
	
}
