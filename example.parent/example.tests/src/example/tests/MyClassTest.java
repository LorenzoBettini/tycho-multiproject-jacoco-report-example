package example.tests;

import org.junit.Test;

import example.plugin.MyClass;

public class MyClassTest {

	private MyClass myClass = new MyClass();

	@Test
	public void test() {
		myClass.myMethod();
	}

}
