package ch05.ex01.case01; 
// 클래스명 풀네임 : ch05.ex01.case01.TimeMain
// 클래스명 쇼트네임 : TimeMain

public class TimeMain {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 25;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		Time time1 = new Time();
		time1.hour = 12;
		time1.minute = 25;
		time1.second = 30;
		System.out.printf("%d시 %d분 %d초\n", time1.hour, time1.minute, time1.second);
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
	
		System.out.println(time1); 
		// ch05.ex01.case01.Time@1b6d3586라는 객체 정보를 출력.
		// 1b6d3586는 hash code이다.
		System.out.println(time2); 
		// ch05.ex01.case01.Time@4554617c라는 객체 정보를 출력.
		// 4554617c는 hash code이다.
		//위 두개는 같은 데이터 타입에 다른 해쉬코드를 가지고 있으므로 
		//같은데이터 타입에 다른 객체, 다른 메모리 공간을 가지고 있다.
	}
}
