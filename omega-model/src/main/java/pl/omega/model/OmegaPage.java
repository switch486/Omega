package pl.omega.model;

public class OmegaPage {
	
	private final String value;
	
	private OmegaPage(String s) {
		value = s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OmegaPage) {
			OmegaPage p = (OmegaPage) obj;
			return value.equals(p.value);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}

	/**
	 * The general Page
	 */
	public static final OmegaPage OVERVIEW = new OmegaPage("overview");

	/**
	 * The buildings Page (resources, warehouses, hideouts and power plants)
	 */
	public static final OmegaPage RESOURCES = new OmegaPage("resources");

	/**
	 * The civil buildings Page (robot factory, dock, lab, rocket silo, nanits and terraformer)
	 */
	public static final OmegaPage STATION = new OmegaPage("station");

	/**
	 * This costs some Antimateria, use with caution
	 */
	@Deprecated
	public static final OmegaPage TRADER = new OmegaPage("trader");

	/**
	 * The scientific Page (technologies, engines and more)
	 */
	public static final OmegaPage RESEARCH = new OmegaPage("research");

	/**
	 * The ships Page
	 */
	public static final OmegaPage SHIPYARD = new OmegaPage("shipyard");

	/**
	 * The defense Page (cannons, shields and rockets)
	 */
	public static final OmegaPage DEFENSE = new OmegaPage("defense");

	/**
	 * the available ships Page
	 */
	public static final OmegaPage FLEET1 = new OmegaPage("fleet1");

	// TODO Adam Puchalski - Mar 23, 2012 - there are more pages... this will expand.

	/**
	 * The current galaxy Page and neighborhood
	 */
	public static final OmegaPage GALAXY = new OmegaPage("galaxy");

	/**
	 * Your alliance Page.
	 */
	public static final OmegaPage ALLIANCE = new OmegaPage("alliance");

	/**
	 * This costs some Antimateria, use with caution
	 */
	@Deprecated
	public static final OmegaPage PREMIUM = new OmegaPage("premium");

	/**
	 * The Technology Page
	 */
	public static final OmegaPage TECH_INFO = new OmegaPage("techinfo");
	
	/**
	 * The Technology Tree
	 */
	public static final OmegaPage GLOBAL_TECH_TREE = new OmegaPage("globalTechtree");
	
	/**
	 * The resource settings with the production levels for a planet
	 */
	public static final OmegaPage RESOURCE_SETTINGS = new OmegaPage("resourceSettings");
}
