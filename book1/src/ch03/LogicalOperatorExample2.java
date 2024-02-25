package ch03;

public class LogicalOperatorExample2 {

	public static void main(String[] args) {
		boolean r1 = (100 > 0) || (byZero(0) > 0); //byZero(0)가 호출되지 않는다. -> Dead code
		System.out.println(r1);
		boolean r2 = (100 > 0) | (byZero(0) > 0); //byZero(0)가 호출된다. -> java.lang.ArithmeticException
		System.out.println(r2);
	}
	
	//0으로 나누기
	public static int byZero(int arg) {
		int result = 20 / arg;
		return result;
	}
}