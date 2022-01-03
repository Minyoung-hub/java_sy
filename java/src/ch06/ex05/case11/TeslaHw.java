package ch06.ex05.case11;

public class TeslaHw implements SmartCar{
	private SmartCar software;
	// 하나의 객체가 두개 이상의 데이터 타입을 가지는 성질을 다형성이라고 한다.
	// 멤버변수의 데이터 타입을 인터페이스로 두게 되면 확장성이 좋아진다.
	
	
	public TeslaHw(SmartCar software) {
		this.software = software;
	}
	
	@Override
	public void start() {
		software.start();
	}
	
	@Override
	public void stop() {
		software.stop();
	}
	
	@Override
	public void klaxon() {
		software.klaxon();
	}
}