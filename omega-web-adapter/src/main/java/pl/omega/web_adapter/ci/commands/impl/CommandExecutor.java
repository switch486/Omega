package pl.omega.web_adapter.ci.commands.impl;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import pl.omega.web_adapter.ci.commands.ExecutedCommand;
import pl.omega.web_adapter.util.Command;

public class CommandExecutor {

	public ExecutedCommand executeCommand(Command c) {
		ExecutedCommand result = new ExecutedCommand(c);
		
		//TODO logging in here would be nice!
		HttpClient client = new HttpClient();
		
		client.getHostConfiguration().setHost("", 80, "http");
        client.getParams().setCookiePolicy("compatibility");

        GetMethod getMethod = new GetMethod(c.getURL());

        try {
			client.executeMethod(getMethod);
		} catch (Exception e) {
			result.addException(e);
			return result;
		} 
        
        try {
			result.setOutputBody(getMethod.getResponseBodyAsString());
		} catch (IOException e) {
			result.addException(e);
			return result;
		}
        result.setCookies(client.getState().getCookies());
		
		return result;
	}
	
}
