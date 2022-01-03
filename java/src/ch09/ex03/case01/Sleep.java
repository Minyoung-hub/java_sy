package ch09.ex03.case01;

public class Sleep {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(1000);
				//sleep을 호출한 녀석이 잔다. = main thread가 잔다.
			}catch(InterruptedException e) {}
		}
	}
}