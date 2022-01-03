package ch02.ex02.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C02 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2019, 12, 25);
		LocalTime localTime = LocalTime.of(18, 7, 13);
		LocalDateTime localDateTime = LocalDateTime.of(LocalDate.of(2019, 12, 25), LocalTime.of(18, 7, 13));
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);

	}

}
