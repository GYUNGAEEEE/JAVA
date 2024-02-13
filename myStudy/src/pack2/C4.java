package pack2;

import pack1.A4;

public class C4 {
	public C4() {
		A4 a = new A4();
		a.field1 = 1;   
		//a.field2 = 1; default 생성자 접근 불가(컴파일 에러)    
		//a.field3 = 1; private 생성자 접근 불가(컴파일 에러)   
		
		a.method1();   
		//a.method2(); default 생성자 접근 불가(컴파일 에러)   
		//a.method3(); private 생성자 접근 불가(컴파일 에러)   
	}
}
