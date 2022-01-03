package ch05.ex01.home;

import java.time.LocalDate;

public class Person {
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
}
