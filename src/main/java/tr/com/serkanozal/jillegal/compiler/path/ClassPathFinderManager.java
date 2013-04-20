/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.path;

import java.util.List;

import tr.com.serkanozal.jillegal.compiler.path.finder.ClassPathFinder;

public interface ClassPathFinderManager extends ClassPathFinder {

	void addClassPathFinder(ClassPathFinder classPathFinder);
	void removeClassPathFinder(ClassPathFinder classPathFinder);
	List<ClassPathFinder> listClassPathFinders();
	
}
