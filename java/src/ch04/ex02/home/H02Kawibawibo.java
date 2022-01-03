package ch04.ex02.home;

import java.util.Scanner;

public class H02Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.가위, 2.바위, 3.보\n>> ");
		int me = sc.nextInt();
		int com = (int)(Math.random() * 10 % 3 + 1);
		String result = "";
		String me2 = "";
		String com2 = "";
		
		if(com == me) result = "비겼습니다.";
		else if(com == 1) {
			if(me == 2) result = "당신이 이겼습니다.";
			else if(me == 3) result = "당신이 졌습니다.";
		}
		else if(com == 2) {
			if(me == 3) result = "당신이 이겼습니다.";
			else if(me == 1) result = "당신이 졌습니다.";
		}
		else if(com == 3) {
			if(me == 1) result = "당신이 이겼습니다.";
			else if(me == 2) result = "당신이 졌습니다.";
		}
		else result = "1, 2, 3 중에 입력해주십시오.";
		
		switch(com) {
		case 1: com2 = "가위"; break;
		case 2: com2 = "바위"; break;
		case 3: com2 = "보";
		}
		switch(me) {
		case 1: me2 = "가위"; break;
		case 2: me2 = "바위"; break;
		case 3: me2 = "보";
		}
		System.out.println("당   신 : "+ me2);
		System.out.println("알파고 : "+ com2);
		System.out.println(result);
		


	}

}
