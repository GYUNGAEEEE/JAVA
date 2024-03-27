package ch08;

public class FinallyTest2 {

	public static void main(String[] args) {
		try {
			startinstall();
			copyFiles ();
		} catch (Exception e) {
			e.printStackTrace ();
		} finally {
			deleteTempFiles();
		}
	}

	static void startinstall() {
		/* 프로그램 설치에 필요한 준비를 하는 코드를 적는다. */
	}
	static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */ }
	
}
