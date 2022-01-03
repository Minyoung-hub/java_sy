package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = (int)(pi * 10) / 10d;
		// d를 써서 double타입을 만들지 않으면 int형으로 3.0이 나오게 된다.
		System.out.println("shortPi : " + shortPi);
		
		shortPi = (int)(pi * 1000) / 1000d;
		System.out.println("shortPi : " + shortPi);
		// 0의 갯수에 따라 소수점이 결정된다.
		
		shortPi = Math.round(pi * 1000) / 1000d; // 반올림
		System.out.println("shortPi : " + shortPi);
		
		shortPi = Math.floor(pi * 1000) / 1000d; // 내림
		System.out.println("shortPi : " + shortPi);
	}

}
