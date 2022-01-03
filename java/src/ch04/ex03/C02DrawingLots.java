package ch04.ex03;

public class C02DrawingLots {
	public static void main(String[] args) {
		int random = 1; 
		// 바로 랜덤을 주지 않은 이유는 한번도 안뽑았을 때 3의 배수가 나오는 버그를 피하기 위해서이다.
		int cnt = 0;
		
		while(!(random%3==0)) {
			cnt++;
			random = (int)(Math.random()*100)+1;
		}
		System.out.printf("%d번 뽑아서, %d를 찾았습니다.", cnt, random);
	}

}
