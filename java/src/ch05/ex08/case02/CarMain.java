package ch05.ex08.case02;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("blue");
		car.setDoor(4);
		System.out.println(car);
		
		car = new Car("red", 2);
		System.out.println(car);
	}
}