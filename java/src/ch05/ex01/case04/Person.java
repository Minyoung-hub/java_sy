package ch05.ex01.case04;

public class Person {
	int age;
	String name;
	
	void setName(String myName) {//입력
		name = myName; //출력
		//void 뜻이 return되는 값이 없다는 뜻이다.
	}

	//메소드의 입력값을 parameter라고 부른다.
	void setAge(int myAge) {
		age = myAge;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	//멤버변수 2개 멤버메소드 4개-> 그중에 읽어내는거 두개 출력하는거 두개
	}
