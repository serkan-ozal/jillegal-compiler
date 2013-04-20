/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.path;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import tr.com.serkanozal.jillegal.compiler.path.finder.ClassPathFinder;
import tr.com.serkanozal.jillegal.compiler.path.finder.DefaultClassPathFinder;
import tr.com.serkanozal.jillegal.compiler.path.finder.LibClassPathFinder;
import tr.com.serkanozal.jillegal.compiler.path.finder.MavenClassPathFinder;

public class DefaultClassPathFinderManager implements ClassPathFinderManager {

	protected List<ClassPathFinder> classPathFinderList = new ArrayList<ClassPathFinder>();
	
	public DefaultClassPathFinderManager() {
		initClassPathFinders();
	}
	
	protected void initClassPathFinders() {
		classPathFinderList.add(new DefaultClassPathFinder());
		classPathFinderList.add(new LibClassPathFinder());
		classPathFinderList.add(new MavenClassPathFinder());
	}
	
	@Override
	public void addClassPathFinder(ClassPathFinder classPathFinder) {
		classPathFinderList.add(classPathFinder);
	}

	@Override
	public void removeClassPathFinder(ClassPathFinder classPathFinder) {
		classPathFinderList.remove(classPathFinder);
	}

	@Override
	public List<ClassPathFinder> listClassPathFinders() {
		return classPathFinderList;
	}

	@Override
	public String findClassPath() {
		StringBuilder classPathBuilder = new StringBuilder();
		
		for (ClassPathFinder classPathFinder : classPathFinderList) {
			String classPath = classPathFinder.findClassPath();
			if (StringUtils.isEmpty(classPath) == false) {
				classPathBuilder.append(classPath).append(File.pathSeparator);
			}	
		}
		
		return classPathBuilder.toString();
	}

}
