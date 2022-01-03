package ch05.ex05.home03;

import java.util.Scanner;

public class BallMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ball ball = new Ball();
		BallMachine machine = new BallMachine();
		char isContinue = 0;
		
		do {
			System.out.println(machine.pull());
			System.out.print("계속 공을 뽑을까요?(y/n)>> ");
			isContinue = sc.nextLine().charAt(0);
		}while(isContinue == 'y');
	
		System.out.println("종료합니다.");
		sc.close();
	}
}