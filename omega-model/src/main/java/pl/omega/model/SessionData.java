package pl.omega.model;

public class SessionData {
	
	private final String logInName;
	private final String password;
	private final String universum;
	
	private String sessionID;
	
	/**
	 * @param logInName the login
	 * @param password the password
	 * @param universum the universum
	 */
	public SessionData(String logInName, String password, String universum) {
		this.logInName = logInName;
		this.universum = universum;
		this.password = password;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getLogInName() {
		return logInName;
	}

	public String getPassword() {
		return password;
	}

	public String getUniversum() {
		return universum;
	}
	
	

}
