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
	
	/**
	 * Properties initialized with key value list.
	 * @param values the values to initialize the Properties.
	 * @throws IllegalStateException in case the size of the initialization values is odd.
	 */
	public Properties(String... values) {
		super ();
		if (values.length %2 != 0) {
			throw new IllegalStateException("Properties " + values + " cannot be instantiated with odd number of values.");
		}
		for (int i=0; i<values.length-1; i++) {
			setProperty(values[i], values[i+1]);
		}
	}
	
	/**
	 * Empty Properties
	 */
	public Properties() {
		super ();
	}

}
