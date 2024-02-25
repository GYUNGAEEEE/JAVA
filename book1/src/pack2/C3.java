package pack2; //패키지가 다름

import pack1.A3;

public class C3 {
	// 필드
	A3 a1 = new A3(true);
	// A3 a2 = new A3(1); default 생성자 접근 불가(컴파일 에러)
	// A3 a3 = new A3("문자열"); private 생성자 접근 불가(컴파일 에러)
}
