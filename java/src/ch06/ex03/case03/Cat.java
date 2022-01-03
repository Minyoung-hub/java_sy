package ch06.ex03.case03;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age) {
		super(); 
		// 자식클래스 생성자의 첫줄에는 super() 생성자 호출문이 있다.
		// 이것은 프로그래머가 추가시켜주지 않아도 자동으로 생성된다.
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}