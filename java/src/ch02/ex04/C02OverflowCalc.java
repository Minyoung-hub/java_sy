package ch02.ex04;

public class C02OverflowCalc {
	public static void main(String[] args) {
		byte b = 126;
		System.out.println("b : " + b);
		b++; // b가 갖고 있는 데이터를 읽은 다음에 그 데이터를 1증가시키고 다시 b에 저장시킴. 즉, b = b + 1 과 같다.
		System.out.println("b : " + b);
		b++;
		System.out.println("b : " + b);
		b++;
		System.out.println("b : " + b);
	}

}
