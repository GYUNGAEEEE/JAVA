package ch04;

public class DoWhileExample {

	public static void main(String[] args) {
		int input = -1;
		System.out.println("----아래는 while문 실행결과----");
		while(input != -1) {
			System.out.println("while문 실행");
		}
		System.out.println("while문 종료");
		
		System.out.println("----아래는 do-while문 실행결과----");
		do {
			System.out.println("do-while문 실행");
		}while(input != -1);
		System.out.println("do-while문 종료");
	}

}
