package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false ;
		power = !power;
		System.out.println("power : " + power);
		
		power = !power;
		System.out.println("power : " + power);
		// '!'는 boolean 피연산자에만 작동한다.

	}

}
