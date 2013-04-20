/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.path.finder;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;

public class DefaultClassPathFinder extends BaseClassPathFinder {

	@SuppressWarnings("deprecation")
	@Override
	protected String getClassPath() {
		String classPath = "";
		
		URL classLocation = this.getClass().getProtectionDomain().getCodeSource().getLocation();
		URL classesLocation = this.getClass().getClassLoader().getResource("/");
		
		if (classLocation != null) {
			classPath += classLocation.getPath() + File.pathSeparator;
		}
		if (classesLocation != null) {
			classPath += classesLocation.getPath() + File.pathSeparator;
		}
		
		classPath = URLDecoder.decode(classPath);
		
		return classPath;
	}

}
