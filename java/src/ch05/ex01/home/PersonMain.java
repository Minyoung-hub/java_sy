package ch05.ex01.home;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		Person person = new Person();
		
		System.out.print("이름을 입력하세요.\n>> ");
		person.setName(sc.nextLine());
		System.out.print("나이를 입력하세요.\n>> ");
		person.setAge(sc.nextInt());
		
		System.out.println("입력하신 1명의 정보는 다음과 같습니다.");
		System.out.printf("이   름 : %s\n나   이 : %d살\n등록일 : " + date, 
				person.getName(), person.getAge());
		
		sc.close();
	}

}
