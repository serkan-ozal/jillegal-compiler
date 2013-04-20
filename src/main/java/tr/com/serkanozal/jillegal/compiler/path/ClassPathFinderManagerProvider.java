/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.path;

public class ClassPathFinderManagerProvider {

	private static ClassPathFinderManager classPathFinderManager = new DefaultClassPathFinderManager();
	
	private ClassPathFinderManagerProvider() {
		
	}
	
	public static ClassPathFinderManager getClassPathFinderManager() {
		return classPathFinderManager;
	}
	
	public static void setClassPathFinderManager(ClassPathFinderManager classPathFinderManager) {
		ClassPathFinderManagerProvider.classPathFinderManager = classPathFinderManager;
	}

}
