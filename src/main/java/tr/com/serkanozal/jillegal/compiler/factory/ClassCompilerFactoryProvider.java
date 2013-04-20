/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.factory;

public class ClassCompilerFactoryProvider {

	private static ClassCompilerFactory classCompilerFactory = new DefaultClassCompilerFactory();
	
	private ClassCompilerFactoryProvider() {
		
	}
	
	public static ClassCompilerFactory getClassCompilerFactory() {
		return classCompilerFactory;
	}
	
	public static void setClassCompilerFactory(ClassCompilerFactory classCompilerFactory) {
		ClassCompilerFactoryProvider.classCompilerFactory = classCompilerFactory;
	}

}
