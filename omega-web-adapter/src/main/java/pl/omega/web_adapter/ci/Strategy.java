package pl.omega.web_adapter.ci;

public enum Strategy {

	/**
	 * Only the Overview Page - always eager
	 */
	ROOT, 
	
	/**
	 * Only one Omega Page - always eager
	 */
	SINGLE_PAGE,
	
	/**
	 * All pages for one planet - eager for the Overview page of the Home planet only
	 */
	SINGLE, 
	
	/**
	 * All pages for all planets - eager for the Overview page of the Home planet only 
	 */
	EAGER,  
	
}
