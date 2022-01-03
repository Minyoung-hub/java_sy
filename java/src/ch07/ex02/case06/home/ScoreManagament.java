package ch07.ex02.case06.home;

import java.util.Scanner;

public class ScoreManagament {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		int avg = 0;
		
		System.out.println("성적 관리 앱을 시작합니다.");
		System.out.print("학생수를 입력하세요.\n>> ");
		int num = sc.nextInt();
		int[][]score = new int[num][5];
		System.out.println("학생별 점수 입력을 시작합니다.");
		
		for(int i=0; i<num; i++) {
			System.out.println(i+1+"번째 학생입니다.");
			
			for(int j = 0; j<score[i].length; j++) {
				switch(j) {
				case 0: 
					System.out.print("국어 점수를 입력하세요.\n>> "); 
					score[i][j] = sc.nextInt(); sc.nextLine();
					kor = score[i][j];
					break;
				case 1: 
					System.out.print("영어 점수를 입력하세요.\n>> "); 
					score[i][j] = sc.nextInt(); sc.nextLine();
					eng = score[i][j];
					break;
				case 2: 
					System.out.print("수학 점수를 입력하세요.\n>> "); 
					score[i][j] = sc.nextInt(); sc.nextLine();
					math = score[i][j];
					break;
				case 3: 
					sum = kor + eng + math;
					score[i][j] = sum;
					break;
				case 4:
					avg = sum / 3;
					score[i][j] = avg;
				}
			}
		}
		System.out.println("점수 입력이 끝났습니다.");
		System.out.println("번호 국어 영어 수학  합계  평균");
		System.out.println("===================");
		
		for(int i=0; i<num; i++) {
			System.out.printf(" %d ", i+1);
			
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================");
		System.out.print("성적관리 앱을 종료합니다.");
	}
}