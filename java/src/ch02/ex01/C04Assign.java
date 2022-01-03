package ch02.ex01;

public class C04Assign {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b); // 여기까지는 메모리 공간에 1이 두개, 2가 두개 저장되어 있다.
		
		a = b ; // 여기까지는 메모리 공간에 1이 한개, 2가 세개 저장되어 있다.
		System.out.printf("%d, %d\n", a, b);
		
		a = b + 1;
		System.out.printf("%d, %d\n", a, b); // 데이터를 읽어올때는 메모리를 쓰지 않는다.
		
		double d = Math.random(); // 0.0이상 1.0미만의 값 중 랜덤 값을 불러온다. [0.0, 1.0)
		System.out.printf("%.2f", d);
	}

}
