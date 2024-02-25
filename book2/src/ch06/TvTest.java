package ch06;

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

public class TvTest {

	public static void main(String[] args) {
		System.out.println("===예제 6-1===");
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
		System.out.println();
		
		System.out.println("===예제 6-2===");
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		System.out.println();
		
		System.out.println("===예제 6-3===");
		Tv t3 = new Tv();
		Tv t4 = new Tv();
		System.out.println("t3의 channel값은 " + t3.channel + "입니다.");
		System.out.println("t4의 channel값은 " + t4.channel + "입니다.");
		
		t4 = t3;
		t3.channel = 7;
		System.out.println("t3의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t3의 channel값은 " + t3.channel + "입니다.");
		System.out.println("t4의 channel값은 " + t4.channel + "입니다.");
	}

}
