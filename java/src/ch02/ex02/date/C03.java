package ch02.ex02.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class C03 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		int year = localDate.getYear();
		int dayOfYear = localDate.getDayOfYear();
		int dayOfMonth = localDate.getDayOfMonth();
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		Month month = localDate.getMonth();
		int monthValue = localDate.getMonthValue();
		boolean leap = localDate.isLeapYear();
		
		System.out.println(dayOfMonth);
		System.out.println(dayOfWeek);
		System.out.println(month);
		System.out.println(monthValue);
		System.out.println(leap);
		
		System.out.println("오늘은 "+year+"년 "+monthValue+"월(" +month+ ") "+dayOfMonth+"일 "+dayOfWeek+"입니다.");
		System.out.printf("%d년까지 %d일 남았습니다.", year+1, 365-dayOfYear);

	}

}
