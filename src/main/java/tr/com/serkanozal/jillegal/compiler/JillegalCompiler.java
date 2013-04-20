/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.compiler;

import tr.com.serkanozal.jillegal.compiler.initializer.CompilerInitializer;

public class JillegalCompiler {

	public static String VERSION = "1.0.0-RELEASE";

	private JillegalCompiler() {
		
	}
	
	public static void init() {
		CompilerInitializer.init();
	}
	
}
