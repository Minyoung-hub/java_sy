package ch05.ex01.case02;

public class Time {
	int hour;
	int minute;
	int second;
	
	public String toString() { //메소드 이름 toString이고, 멤버 메소드 이다. //메소드를 다 실행하면 String타입의 값이 만들어질거라는 의미
		return String.format("%d시 %d분 %d초\n", hour, minute, second);
		// return -> 돌려주다 
		// 메소드를 선언만 한 것이지 작동을 시킨 것은 아님. 그래서 이 메소드를 호출한 사람에게 이 값을 리턴해주겠다는 의미.
		// 이순간에는 멤버메소드이든 멤버 변수이든 메모리 공간을 차지하지 않지만 main함수에서 이 클래스를 사용하면 메모리를 사용하게 됨.
		// 이 메소드는 기능일뿐 메모리 공간을 차지하지 않는다. 그저 디자인, 설계도임.
	}
}
