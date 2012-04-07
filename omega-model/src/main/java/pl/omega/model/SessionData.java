package pl.omega.model;


public class SessionData {
	
	private String logInName;
	private String password;
	private String universum;
	private String domain;

	/**
	 * @param logInName the login
	 * @param password the password
	 * @param universum the universum
	 * @param domain the domain
	 */
	public SessionData(String logInName, String password, String universum, String domain) {
		this.logInName = logInName;
		this.universum = universum;
		this.password = password;
		this.domain = domain;
	}

	public SessionData() {
		// NOP
	}

	public String getDomain() {
		return domain;
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
