package ch05.ex01.case07;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
		//this.name은 멤버변수의 name과 지역변수의 name을 비교하기 위해 사용한다.
		//this.name은 멤버변수의 name을 의미한다.
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
