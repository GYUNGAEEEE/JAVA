package ch06;

public class Car4 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car4() {
	}
	
	Car4(String model) {
		this(model, null, 0);
	}
	
	Car4(String model, String color) {
		this(model, color, 0);
	}
	
	Car4(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
