package ch05;

import java.util.Arrays;

public class ShallowCopyExample {

	public static void main(String[] args) {
		//얕은복사(shallowCopy)
		int[] a = null;
		{
			int[] b; //b는 지역변수: {}를 벗어나면 사용할 수 없다.
			b = new int[5]; //new하면 heap영역에 저장 = 프로그램이 끝나야 없어진다
			b[0] = 100;
			a = b; //주소복사 = 얕은복사
		}
		//System.out.println("b = " + b); 에러발생
		System.out.println("a = " + a); //변수 a를 통해서 b의 주소에 접근하여 작업 실행
		System.out.println(Arrays.toString(a));
	}

}
