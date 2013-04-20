/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.impl;

import tr.com.serkanozal.jillegal.compiler.path.ClassPathFinderManagerProvider;
import tr.com.serkanozal.jillegal.compiler.path.finder.ClassPathFinder;

public abstract class BaseClassCompiler implements ClassCompiler, ClassPathFinder {

	protected ClassPathFinder classPathFinder;
	
	public BaseClassCompiler() {
		classPathFinder = ClassPathFinderManagerProvider.getClassPathFinderManager();
	}

	@Override
	public String findClassPath() {
		return classPathFinder.findClassPath();
	}
	
}
