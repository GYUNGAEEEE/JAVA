package ch07;

final class Singleton {
	private static Singleton s = new Singleton(); //getInstance()에서 사용될 수 있도록 인스턴스가 미리 생성되어야 하므로 static이어야 한다.
	
	private Singleton() {
	     //...
	}
	
	//인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static이어야 한다.
	public static Singleton getInstance() {
		if(s == null)
			s = new Singleton();
		
	    return s;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); //The constructor Singleton() is not visible
		Singleton s = Singleton.getInstance();
	}

}
