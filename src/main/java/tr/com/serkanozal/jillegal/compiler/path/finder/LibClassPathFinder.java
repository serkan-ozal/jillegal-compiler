/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.path.finder;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.net.URLDecoder;

public class LibClassPathFinder extends BaseClassPathFinder {

	@SuppressWarnings("deprecation")
	@Override
	protected String getClassPath() {
		URL classesLocation = this.getClass().getClassLoader().getResource("/");
		if (classesLocation != null) {
			String classesLocationPath = classesLocation.getPath();
			String libsLocationPath = classesLocationPath + "../lib";
			File libsLocation = new File(libsLocationPath);
			
			File[] filesInLibraryPath = libsLocation.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".jar");
				}
			});
			
			if (filesInLibraryPath != null) {
				for (File libraryFile : filesInLibraryPath) {
					libsLocationPath += File.pathSeparator + URLDecoder.decode(libraryFile.getAbsolutePath());
				}
			}
			
			return URLDecoder.decode(libsLocationPath);
		}
		else {
			return null;
		}
	}

}
