package ch07.ex04.case01;

public class Main {
	public static void main(String[] args) {
		Day day = Day.TUESDAY;
		
		String dayName = "";
		switch(day) {
		case MONDAY: dayName = "월요일"; break;
		case TUESDAY: dayName = "화요일"; break;
		default: dayName = "수요일 ~ 일요일";
		}
		
		System.out.println(dayName);
	}
}