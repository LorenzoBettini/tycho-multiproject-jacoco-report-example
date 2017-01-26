package example.plugin1.tests;

import org.junit.Test;

import example.plugin1.MyClass1;

public class MyClass1Test {

	private MyClass1 myClass = new MyClass1();

	@Test
	public void test() {
		myClass.myMethod1(null);
	}

}
