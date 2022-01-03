package ch05.ex01.case05;

public class Person {
		String name;
		int age;
		//위 두개는 멤버변수
		
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
