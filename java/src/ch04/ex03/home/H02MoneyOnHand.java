package ch04.ex03.home;

public class H02MoneyOnHand {
	public static void main(String[] args) {
		int money = 0;
		int tot = 0;
		
		while(tot<=30000) {
			money = (int)((Math.random() * 10) + 1) * 1000;
			System.out.printf("%d원을 꺼냈습니다.\n", money);
			tot += money;
		}
		System.out.printf("손에 %d원을 쥐었습니다.", tot);
	}

}
