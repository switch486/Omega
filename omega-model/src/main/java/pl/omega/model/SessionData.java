package pl.omega.model;


public class SessionData {
	
	private String logInName;
	private String password;
	private String universum;
	private String domain;
	private String webProxy;

	public String getWebProxy() {
		return webProxy;
	}

	public void setWebProxy(String webProxy) {
		this.webProxy = webProxy;
	}

	/**
	 * @param logInName the login
	 * @param password the password
	 * @param universum the universum
	 * @param domain the domain
	 */
	public SessionData(String logInName, String password, String universum, String domain) {
		this(logInName, password, universum, domain, null);
	}
	
	/**
	 * @param logInName the login
	 * @param password the password
	 * @param universum the universum
	 * @param domain the domain
	 * @param webProxy the proxy
	 */
	public SessionData(String logInName, String password, String universum, String domain, String webProxy) {
		this.logInName = logInName;
		this.universum = universum;
		this.password = password;
		this.domain = domain;
		this.webProxy = webProxy;
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
