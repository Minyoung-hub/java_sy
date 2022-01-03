package ch07.ex01.case09;

public class Shooter {
	private Gun gun;
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	// DI작업을 할 때 필요한 것 -> 생성자, setter
	
	public void fire() {
		this.gun.fire();
	}
}