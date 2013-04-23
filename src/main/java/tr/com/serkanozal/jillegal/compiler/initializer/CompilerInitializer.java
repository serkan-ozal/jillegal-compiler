/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.initializer;

import org.apache.log4j.Logger;

public class CompilerInitializer {

	private static final Logger logger = Logger.getLogger(CompilerInitializer.class);
	
	private static volatile boolean initialized = false;
	
	private CompilerInitializer() {
		
	}
	
	public synchronized static void init() {
		if (initialized == false) {
			// Initialize if needed
			initialized = true;
			logger.info("Jillegal-Compile module has been initialized ...");
		}
	}
	
}
