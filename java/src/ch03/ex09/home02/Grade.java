package ch03.ex09.home02;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0; // 값을 선언할 때 꼭 초기화를 해주자.
		// 변수명을 줄일 때는 앞에서부터 3-4글자로 한다.
		// ex) korea-kor(o), ken(x)
		// 다만 통용되는 줄임말이 몇개 있다. 아래처럼 관례적인 줄임말이 아니라면 위의 법칙을 지켜주자.
		// average-avg, count-cnt, temporary-temp, tmp, total-tot
		int total = 0;
		double avg = 0.0;
		char grade = 0;
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total / 3.0; // 그냥 3으로 나누면 Overflow발생, total값에 1.0을 곱해줄수도 있지만 그렇게 하면 연산이 두번일어나기때문에 비효율적이다.
		grade = avg >= 90 ? 'A' : 
				(avg >= 80 ? 'B' : (avg >= 70 ? 'C' : 'D'));
		
		System.out.printf("총점 : %d\n평균 : %.1f\n학점 : %c", total, avg, grade);
		
		sc.close(); // 키보드를 통해서 더이상 입력받을 데이터가 없을 때 써준다. Scope을 벗어나면 알아서 없어지긴함. 하지만 좀더 확실하게 하려면 써주는게 좋다.
	}

}
