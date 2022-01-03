package ch04.ex01.home;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		double avg = tot / 3.0;
		String grade = "";
		
		if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else grade = "D";
		
		System.out.printf("총점 : %d\n평균 : %.1f\n등급 : %s", tot, avg, grade);
		
	}

}
