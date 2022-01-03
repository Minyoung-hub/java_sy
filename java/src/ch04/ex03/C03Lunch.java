package ch04.ex03;

public class C03Lunch {
	public static void main(String[] args) {
		//break는 자신의 블록을 빠져나온다는 의미로 while에서도 쓸 수 있다.
		int calorie = 0;
		int food = 0;
		int cnt = 0;
		
		while(calorie<30) {
			food = (int)(Math.random() * 10) + 1;
			System.out.print(food + "cal.");
			if(food % 5 ==0) { // 상한음식이라면
				System.out.println(" 뱉다."); 
				cnt++;
				break;
			}
			System.out.println(" 먹다.");
			calorie += food;
			cnt++;
		}
		System.out.println();
		System.out.println(cnt + "번 " + calorie + "cal. 만큼 먹었습니다.");
	}

}
