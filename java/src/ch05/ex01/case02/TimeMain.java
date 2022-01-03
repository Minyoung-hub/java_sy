package ch05.ex01.case02;

public class TimeMain {
	public static void main(String[] args) {
		Time time /* 4바이트 지역변수이고 stack에 생김 */ = new Time(); /* 12바이트 공간을 사용하고 있는 heap에 있는 멤버변수를 찾아간다 */
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		System.out.printf("%s", time);
		System.out.printf("%s", time.toString());
		
		
	}

}
