package ch02.ex04;

public class C01OverFlowCast {
	public static void main(String[] args) {
		byte b = 10;
		int i = b ; // promotion - casting연산자를 사용하지 않는 자동 형변환
		i = (int)b; // casting - casting연산자를 이용한 형변환
		System.out.println("i : " + i);
		
		int i2 = 300;
		byte b2 = (byte)i2;
		System.out.println("b2 : " + b2);

	}

}
