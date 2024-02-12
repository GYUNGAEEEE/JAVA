package ch07;

public class SportsCar extends Car2 {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
