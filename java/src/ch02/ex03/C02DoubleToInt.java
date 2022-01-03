package ch02.ex03;

public class C02DoubleToInt {
	public static void main(String[] args) {
		double d = 1.52;
		int i = (int)d;
		System.out.println("i : " + i); // 0.52 버려지는 Overflow됨
		
		// 데이터 타입 변환 없이 소수점 이하 값을 털어버리는 방법
		double f = Math.floor(d); // 그냥 소수점 아래를 없애버림.
		double r = Math.round(d); // 반올림으로 소수점 아래를 털어버림.
		System.out.printf("%.2f, %.2f\n", f, r);
		
		int f2 = (int)f;
		int r2 = (int)r;
		System.out.printf("%d, %d\n", f2, r2);
		
	}

}
