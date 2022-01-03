/*
 * 국, 영, 수 점수를 입력받은 뒤, 총점, 평균, 학점을 출력하라.
 * 평균 학점
 * 90점대 A (100점 포함)
 * 80점대 B
 * 70점대 C
 * 나머지 D
 */
package ch03.ex09.home01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("국어 : "); int kor = sc.nextInt(); 
		System.out.print("영어 : "); int eng = sc.nextInt();
		System.out.print("수학 : "); int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		char grade = avg >= 90 ? 'A' : (avg >= 80 ? 'B' : (avg >= 70 ? 'C' : 'D'));
		
		System.out.printf("총점 : %d\n평균 : %.1f\n학점 : %c", sum, avg, grade);
		
		sc.close();
	}

}
