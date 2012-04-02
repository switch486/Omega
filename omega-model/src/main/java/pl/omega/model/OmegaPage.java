package pl.omega.model;

public interface OmegaPage {

	/**
	 * The general Page
	 */
	public static final String OVERVIEW = "overview";

	/**
	 * The buildings Page (resources, warehouses, hideouts and power plants)
	 */
	public static final String RESOURCES = "resources";

	/**
	 * The civil buildings Page (robot factory, dock, lab, rocket silo, nanits and terraformer)
	 */
	public static final String STATION = "station";

	/**
	 * This costs some Antimateria, use with caution
	 */
	@Deprecated
	public static final String TRADER = "trader";

	/**
	 * The scientific Page (technologies, engines and more)
	 */
	public static final String RESEARCH = "research";

	/**
	 * The ships Page
	 */
	public static final String SHIPYARD = "shipyard";

	/**
	 * The defense Page (cannons, shields and rockets)
	 */
	public static final String DEFENSE = "defense";

	/**
	 * the available ships Page
	 */
	public static final String FLEET1 = "fleet1";

	// TODO Adam Puchalski - Mar 23, 2012 - there are more pages... this will expand.

	/**
	 * The current galaxy Page and neighborhood
	 */
	public static final String GALAXY = "galaxy";

	/**
	 * Your alliance Page.
	 */
	public static final String ALLIANCE = "alliance";

	/**
	 * This costs some Antimateria, use with caution
	 */
	@Deprecated
	public static final String PREMIUM = "premium";

}
