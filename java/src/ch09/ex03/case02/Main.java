package ch09.ex03.case02;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName() + ": start");
		
		Thread counter = new Thread(new Counter());
		// Thread()에서 여기 괄호안에는 Runnalbe 타입만 들어올 수 있다.
		counter.start();
		
		int tries = 0;
		while(counter.isAlive()) {
			tries++;
			counter.join(1000);
			// 메인 스레드가 조인을 호출해서 카운터 스레드와 메인 스레드가 결합을 한다.
			// 그려면 메인은 카운터 스레드를 1초간 바라본다.(죽기를 바라면서)
			// 카운터 스레드 = 스레드-0
			System.out.println(Thread.currentThread().getName() + ": wait" + tries);
			
			if(tries>2) {
				System.out.println(Thread.currentThread().getName()+": irritated");
				counter.interrupt();
				counter.join();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+": end");
	}
}
// 프로세스가 존재하기 위해 최소 한개이상의 스레드가 필요하다.
// 그렇기때문에 스레드가 다 죽으면 프로세스도 존재하지 않는다.