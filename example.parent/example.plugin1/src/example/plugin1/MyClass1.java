package example.plugin1;

public class MyClass1 {

	public void myMethod2(String name) {
		if (name != null) {
			// this condition won't be tested
			System.out.println("hello " + name);
		}
		System.out.println("hello");
	}
}
