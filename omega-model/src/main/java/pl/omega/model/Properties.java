package pl.omega.model;

/**
 * @author Adam Puchalski
 */
public class Properties extends java.util.Properties {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	// TODO AP from MP: what do we need it for? is an interface not enough to handle it?
	public String toUrlPart () {
		throw new RuntimeException("IMPLEMENT ME");
	}

}
