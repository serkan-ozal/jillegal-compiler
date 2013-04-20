/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.path.finder;

import org.apache.commons.lang.StringUtils;

public abstract class BaseClassPathFinder implements ClassPathFinder {

	protected String classPath = "";

	abstract protected String getClassPath();
	
	@Override
	public String findClassPath() {
		if (StringUtils.isEmpty(classPath)) {
			String cp = getClassPath();
			if (cp != null) {
				classPath = cp;
			}	
		}
		return classPath;
	}
	
}
