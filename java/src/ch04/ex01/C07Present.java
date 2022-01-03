package ch04.ex01;
// 화면처리에 관련된 로직 - presentation logic
// 화면처리와 관련없는 업무관련 로직 - 비지니스 로직
import java.util.Scanner;

public class C07Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mainChoice = 0;
		int subChoice = 0;
		String prize = "";
		String brand = "";
		
		System.out.print("1.냉장고, 2.세탁기\n>> ");
		mainChoice = sc.nextInt();
		if(mainChoice  == 1) prize = "냉장고";
		else if(mainChoice == 2) prize = "세탁기";
		else prize = "뽀삐 화장지";
		
		if(mainChoice == 1 || mainChoice == 2) {
			System.out.print("1.삼성, 2.엘지, 3.대우\n>> ");
			subChoice = sc.nextInt();
			if(subChoice  == 1) brand = "삼성";
			else if(subChoice == 2) brand = "엘지";
			else if(subChoice == 3) brand = "대우";
		}
		
		prize = brand + prize;
		System.out.print(prize + "를 드립니다.");
		
		sc.close();
	}

}
