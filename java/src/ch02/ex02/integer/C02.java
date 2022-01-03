package ch02.ex02.integer;

public class C02 {
	public static void main(String[] args) {
		char c = 'A' ;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c)); // A가 숫자라는 증거
		
		c = 65 ;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041 ;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0041' ;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));

	}

}
