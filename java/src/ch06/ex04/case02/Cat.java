package ch06.ex04.case02;

public class Cat extends Animal{
	@Override // 실수방지가능!
	public void shout() {
		System.out.println("야옹야옹");
	}
}