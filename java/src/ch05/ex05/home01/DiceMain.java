package ch05.ex05.home01;

import java.util.Scanner;

public class DiceMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		char choice = 0;
		
		do {
			System.out.println(dice.getNumber());

			System.out.print("주사위를 굴릴까요?(y/n)>> ");
			choice = sc.nextLine().charAt(0);
			
		}while(choice == 'y');
		
		System.out.println("종료합니다.");
		sc.close();
	}
}