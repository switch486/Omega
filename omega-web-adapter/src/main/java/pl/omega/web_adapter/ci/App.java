package pl.omega.web_adapter.ci;

import pl.omega.model.SessionData;
import pl.omega.web_adapter.ci.impl.WebAdapterExecutorFacadeImpl;

public class App {

	public static void main(String[] args) {
		WebAdapterExecutorFacade w = new WebAdapterExecutorFacadeImpl();
		
		SessionData sessionData = new SessionData("UczeSie", "calineczka", "uni1", "ogame.pl");
		w.logIn(sessionData);
		
		System.out.println(sessionData);
	}
	
}
