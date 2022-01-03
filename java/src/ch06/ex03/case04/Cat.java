package ch06.ex03.case04;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age) {
		super(name);
		// 모든 클래스에 기본 생성자가 있도록 하자.
		// 혹시 다른 생성자도 쓰고 싶으면 안쓰더라도 기본 생성자를 만들어놓자.
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}