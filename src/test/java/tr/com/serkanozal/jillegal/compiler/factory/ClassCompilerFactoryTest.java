/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tr.com.serkanozal.jillegal.compiler.domain.model.DefaultCodeType;
import tr.com.serkanozal.jillegal.compiler.factory.ClassCompilerFactory;
import tr.com.serkanozal.jillegal.compiler.factory.ClassCompilerFactoryProvider;
import tr.com.serkanozal.jillegal.compiler.factory.DefaultClassCompilerFactory;
import tr.com.serkanozal.jillegal.compiler.impl.groovy.GroovyClassCompiler;
import tr.com.serkanozal.jillegal.compiler.impl.java.JavaClassCompiler;

public class ClassCompilerFactoryTest {

	private ClassCompilerFactory classCompilerFactory = ClassCompilerFactoryProvider.getClassCompilerFactory();
	
	@Before
	public void setup() {
		classCompilerFactory = new DefaultClassCompilerFactory();
	} 
	
	@Test
	public void getClassCompiler() {
		Assert.assertEquals(JavaClassCompiler.class, classCompilerFactory.getClassCompiler(DefaultCodeType.JAVA).getClass());
		Assert.assertEquals(GroovyClassCompiler.class, classCompilerFactory.getClassCompiler(DefaultCodeType.GROOVY).getClass());
	}
	
}
