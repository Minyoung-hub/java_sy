package ch04.ex03.home;
// break를 쓰지 않고 알고리즘을 구현하는 것이 좋다.
public class H01Lunch {

	public static void main(String[] args) {
		int calorie = 0;
		int food = 1;
		
		while(calorie < 30 && food % 5 != 0) {
			food = (int)(Math.random() * 10) + 1;
			System.out.print(food + "cal.");
			if(food % 5 != 0) {
				System.out.println(" 먹다.");
				calorie += food;
			}
			else System.out.println(" 뱉다.");
		}
		System.out.println();
		System.out.println(calorie + "cal. 만큼 먹었습니다.");
	}
}
