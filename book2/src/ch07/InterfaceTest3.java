package ch07;

public class InterfaceTest3 {

	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}

}

class A {
	void methodA() {
		I i = InstanceManager.getlnstance(); 
		i.methodB();
		System.out.println(i.toString());
	}
}

interface I {
	public abstract void methodB() ;
}

class B implements I {
	public void methodB() {
		System.out.println("methodB in B class") ;
	}
	public String toString() { return "class B"; }
}

class InstanceManager {
	public static I getlnstance() {
		return new B();
	}
}