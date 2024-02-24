package pack1;

public class A3 {
	//필드
	A3 a1 = new A3(true);
	A3 a2 = new A3(1);
	A3 a3 = new A3("문자열");

	//생성자	
	public A3(boolean b) {} //public 접근 제한
	A3(int b) {} //default 접근 제한
	private A3(String s) {} //private 접근 제한
}
