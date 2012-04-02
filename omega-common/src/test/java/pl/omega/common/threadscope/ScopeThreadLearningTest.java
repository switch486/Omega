package pl.omega.common.threadscope;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * As part of this project the custom thread scope for spring is being used.
 * This class is a learning test for this thread scope. It's tests if the
 * scope works and can be used for learning how to use it. For more information
 * see: http://www.springbyexample.org/examples/custom-thread-scope-module.html
 *
 * @author Marek Puchalski
 */
public class ScopeThreadLearningTest extends TestCase {

	private SimpleBean sb1;
	private SimpleBean sb2;

	/**
	 * @throws InterruptedException
	 */
	public void testScopeThread() throws InterruptedException {
		final ApplicationContext context =
	    	  new ClassPathXmlApplicationContext(new String[] {"spring-thread-scope-test.xml"});
		Thread t1 = new Thread() {
			@Override
			public void run() {
				sb1 = context.getBean(SimpleBean.class);
			}
		};
		t1.start();
		t1.join();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				sb2 = context.getBean(SimpleBean.class);
			}
		};
		t2.start();
		t2.join();

		// at this point let's just check, that a different instance of object has
		// been returned
		sb1.setTest("test1");
		sb2.setTest("test2");
		assertEquals("test1", sb1.getTest());
		assertEquals("test2", sb2.getTest());
	}
}
