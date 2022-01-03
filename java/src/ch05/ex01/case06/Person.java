package ch05.ex01.case06;

public class Person {
		private String name;
		private int age;
		// 멤버변수 앞에  private이 붙으면 메인메소드에서 직접 불러올 수 없다.
		// 도메인 클래스를 디자인 할 때 캡슐화를 한다. 밑에 두줄이 캡슐화하는 것이다.
		// private member variable -> 감춰놔서 메인메소드에서 찾을 수 없다.
		// public setter, setter
		// 디자인 패턴 중에 캡슐화가 있는 것이다.
		
		//setter
		void setName(String myName) {
			if(myName.charAt(0)=='최') name = myName;
			else name = "무명";
		}
		void setAge(int myAge) {
			if(20<=myAge && myAge<=29) age = myAge;
			else age = 0;
		}
		
		//getter
		String getName(int level) {
			String myName = ""; // 얘는 블록 안에 있으므로 지역변수
			if(level>5) myName = name;
			else myName = "비밀";
			return myName;
		}
		int getAge(int level) {
			int myAge = 0;
			if(level>5) myAge = age;
			else myAge = 1000;
			return myAge;
		}
//setter은 쓰기 getter은 읽기
}
