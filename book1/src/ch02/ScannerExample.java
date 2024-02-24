package ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			//문자열(String)이 동일한지 비교할 때에는 equals() 메소드를 사용한다.
			if(inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");
	}

}
