package pl.omega.common.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class encapsulates the spring context for the whole application.
 *
 * @author Marek Puchalski
 */
public class OmegaRegistry {

	/** Default configuration file to use. */
	public static final String DEFAULT_SPRING_CONFIGURATION = "omega-trigger-spring.xml";

	/** Springs application context. */
	private static ApplicationContext context;

	/** True, if the applications context has been initialized. */
	private static boolean registryInitialized;

	/**
	 * Initializes the springs configuration using the path passed as parameter.
	 *
	 * @param springConfiguration path to the spring configuration file.
	 * @throws IllegalStateException if allready initialized.
	 */
	public static void init(String springConfiguration) {
		if (!registryInitialized) {
			context = new ClassPathXmlApplicationContext(new String[] {springConfiguration});
			registryInitialized = true;
		} else {
			throw new IllegalStateException("Registry has been already initialized.");
		}
	}

	/**
	 * Fetches beans from the springs context.
	 *
	 * @param <T> Type to return the instance for.
	 * @param clazz Class to identify the type.
	 * @return Spring bean.
	 */
	public static <T> T getBean(Class<T> clazz) {
		if (!registryInitialized) {
			init(DEFAULT_SPRING_CONFIGURATION);
		}
		return context.getBean(clazz);
	}
}
