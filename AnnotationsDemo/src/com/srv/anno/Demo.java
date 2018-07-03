package com.srv.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Demo {
	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		 int passed = 0, failed = 0;
	      for (Method m : Class.forName("com.srv.anno.Testt").getMethods()) {
	         if (m.isAnnotationPresent(TestFun.class)) {
	            try {
	               m.invoke(null);
	               passed++;
	            } catch (Throwable ex) {
	               System.out.printf("Test %s failed: %s %n", m, ex.getCause());
	               failed++;
	            }
	         }
	      }
	      System.out.printf("Passed: %d, Failed %d%n", passed, failed);
	}
}