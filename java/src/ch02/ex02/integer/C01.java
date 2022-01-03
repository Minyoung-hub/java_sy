package ch02.ex02.integer;

public class C01 {
	public static void main(String[] args) {
		int x = 10 ; // decimal(10진수)
		System.out.println(Integer.toBinaryString(x)); // 2진수 형태로 표현한 String 값으로 return 된다
		
		x = 012 ; // octal(8진수)
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA ; // hexadecimal(16진수)
		System.out.println(Integer.toBinaryString(x));
		
		// int는 정수로 나타내는 것이지만 십진수로만 표현할 수 있다고 생각하면 안된다. 위와같이 10,8,16,2진수로 모두 표현 가능하다.
		x = 0b1010 ; // binary(2진수)
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567 ; // 천단위로 언더바로 구분기호를 넣는다. 
		System.out.println(x);
		
		double y = 1e1 ; // 1*10의 1승 이라는 의미
		System.out.println(y);

	}

}
