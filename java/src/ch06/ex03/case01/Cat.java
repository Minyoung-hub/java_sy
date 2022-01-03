package ch06.ex03.case01;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age) {
		// this.name = name;
		this.age = age;
	}
	
	// 상속받으면 멤버 메소드와 멤버 변수만 상속 받는다.
	// 생성자는 상속 받지 않는다. 고로 이 클래스에는 생성자가
	// Cat 생성자 하나 뿐이다. Animal 생성자는 상속받지 않아서
	// Animal 생성자는 이 클래스에 없다.
}