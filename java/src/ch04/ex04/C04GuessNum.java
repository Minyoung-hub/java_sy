package ch04.ex04;

import java.util.Scanner;

public class C04GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target = (int)(Math.random() * 1000) + 1;
		int guess = 0;
		int tries = 0;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			guess = sc.nextInt();
			tries++;
			
			if(guess > target)
				System.out.println("더 큰 수를 입력했군요.");
			else if(guess <target)
				System.out.println("더 작은 수를 입력했군요.");
		}while(target != guess);
		
		System.out.printf("%d번만에 %d를 맞췄습니다.", tries, target);
		sc.close();
	}

}
