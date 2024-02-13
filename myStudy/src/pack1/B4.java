package pack1; //패키지가 동일

public class B4 {
	public B4() {
		A4 a = new A4();
		a.field1 = 1;   
		a.field2 = 1;   
		//a.field3 = 1; private 생성자 접근 불가(컴파일 에러)
		
		a.method1();  
		a.method2();  
		//a.method3(); private 생성자 접근 불가(컴파일 에러)  
	}
}
