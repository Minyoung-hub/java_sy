package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<10; i++) System.out.print(i + " ");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				for(char c = 'a'; c<='z'; c++) System.out.print(c + " ");
			}
		});
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end");
	}
}
// thread는 총 3개 : main, thread1, thread2
// start 순서대로 thread가 시간을 할당받는 것은 아니다.
// start 요청만하고 순서는 얘 맘대로함
// 메인스레드가 죽고나서도 스레드1과 스레드2는 자기 할 일이 끝나지 않은 이상 죽지 않는다.