package ch06.ex05.case02;

public abstract class Appliance {
	public abstract void on(); // 추상메서드
	public void off() {};
	
	// 추상메서드가 없다면 추상클래스가 될 수도 있고 일반 클래스가 될 수도 있고 
	// 자유롭지만 추상메서드가 있다면 무조건 추상클래스로 해야한다.
}