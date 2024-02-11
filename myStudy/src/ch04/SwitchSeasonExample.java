package ch04;

public class SwitchSeasonExample {

	public static void main(String[] args) {
		// 3,4,5-봄, 6,7,8-여름, 9,10,11-가을, 12,1,2-겨울
		// 임의정수(1~12)의 달에 해당하는 계절을 출력하시오
		int month = 1;
		String season = "";
		switch(month){
			case 3: 
			case 4:
			case 5: season = "봄"; break;
			case 6: 
			case 7:
			case 8: season = "여름"; break;
			case 9: 
			case 10:
			case 11: season = "가을"; break;
			case 12: 
			case 1:
			case 2: season = "겨울"; break;
			default: season = "기타"; break;
		 }
		 System.out.println(month+"월은 "+season+"입니다.");
	}

}
