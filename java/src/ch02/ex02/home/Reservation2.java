package ch02.ex02.home;

import java.util.Scanner;
import java.time.LocalDate;

public class Reservation2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("공연일자를 입력하세요.");
		System.out.print("년 : "); year = sc.nextInt(); 
		System.out.print("월 : "); month = sc.nextInt();
		System.out.print("일 : "); day = sc.nextInt();
		/* 왜 nextLine();을 추가하지 않나요? 
		 * 다 nextInt();만 쓰고 뒤에 nextLine();이 없기 때문에 굳이 붙일 필요 없다.
		 * nextInt();는 숫자만을 읽는다. nextLine();은 한 라인을 모두 문자열로 읽는다.
		 * 그래도 메모리상에는 \n이 계속 남아있다. (쓰레기 데이터가 남아있다) 
		 * 하지만 괄호가 닫히고 메인메소드가 끝나면 메모리에 있는 값은 사라진다.
		 */
		
		LocalDate localDate = LocalDate.of(year, month, day);
		System.out.println(localDate + "자 공연을 예매했습니다.");
		System.out.println(localDate.minusDays(3) + "까지 무료환불이 가능합니다.");
		sc.close();

	}

}
