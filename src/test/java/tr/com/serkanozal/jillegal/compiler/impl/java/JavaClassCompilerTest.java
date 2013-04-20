/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler.impl.java;

import junit.framework.Assert;

import org.junit.Test;

import tr.com.serkanozal.jillegal.compiler.domain.model.DefaultCodeType;
import tr.com.serkanozal.jillegal.compiler.exception.ClassCompileException;
import tr.com.serkanozal.jillegal.compiler.factory.ClassCompilerFactory;
import tr.com.serkanozal.jillegal.compiler.factory.ClassCompilerFactoryProvider;

@SuppressWarnings("deprecation")
public class JavaClassCompilerTest {

	private ClassCompilerFactory classCompilerFactory = ClassCompilerFactoryProvider.getClassCompilerFactory();
	
	@Test
	public void compileValid() throws Exception {
		String code = 
			"package tr.com.serkanozal.jimco;"+ "\n" +
			"\n" +
			"public class SampleJavaClass {" + "\n" +
			"\n" +
			"\t" + "public String toString() {" + "\n" +
			"\t" + "\t" + "return \"I am SampleJavaClass\";" + "\n" +
			"\t" + 	"}" + "\n" +
			"\n" +
			"}";

		Class<?> compiledClass = classCompilerFactory.getClassCompiler(DefaultCodeType.JAVA).compile(code);
		Assert.assertEquals("tr.com.serkanozal.jimco.SampleJavaClass", compiledClass.getName());
		
		Object obj = compiledClass.newInstance();
		Assert.assertEquals("I am SampleJavaClass", obj.toString());
	}
	
	@Test(expected=ClassCompileException.class)
	public void compileInvalid() throws Exception {
		String code = 
				"package tr.com.serkanozal.jimco;"+ "\n" +
				"\n" +
				"public class SampleJavaClass {" + "\n" +
				"\n" +
				"\t" + "public toString() {" + "\n" + // Note that there is no return type for "toString" method
				"\t" + "\t" + "return \"I am SampleJavaClass\";" + "\n" +
				"\t" + 	"}" + "\n" +
				"\n" +
				"}";

		classCompilerFactory.getClassCompiler(DefaultCodeType.JAVA).compile(code);
	}
	
}
