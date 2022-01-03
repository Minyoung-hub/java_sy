package ch06.ex03.case07;

public class Shooter {
	private Gun gun; // a has a b 에서 a는 dependency가 된다.
	
	public Shooter(Gun gun) { // dependent injection(di)
		this.gun = gun;
	}
	
	public void fire() {
		this.gun.fire();
	}
}