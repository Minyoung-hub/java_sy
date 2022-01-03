package ch02.ex02.home;
import java.time.LocalDate;
/*
 * 공연관림일자를 입력하세요.
 * 년 :
 * 월 :
 * 일 :
 * 2019-12-26자 공연을 예매 했습니다.
 * 2019-12-23까지 무료환불이 가능합니다.
 */
import java.util.Scanner;

public class Reservation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("공연일자를 입력하세요\n년 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();
		
		LocalDate localDate = LocalDate.of(year, month, day);		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		System.out.println(localDate + "자 공연을 예매 했습니다.");
		System.out.print(localDate.minusDays(3) + "까지 무료환불이 가능합니다.");
		
		sc.close();
	}

}
