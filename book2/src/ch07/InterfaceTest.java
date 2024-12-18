/*
package ch07;

class A {
	public void methodA(B b) {
		b.methodB();
	}
}

class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
	}

}
*/
package ch07;

class A {
	public void methodA(I i) {
		i.methodB();
	}
}

class B implements I {
	public void methodB() {
		System.out.println("methodB()");
	}
}

interface I {
	public abstract void methodB();
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
	}

}
