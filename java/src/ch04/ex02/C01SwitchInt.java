package ch04.ex02;

public class C01SwitchInt {
	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		switch(grade) { // Switch옆에 조건식에는 integer(byte short int long) type과 String type을 쓸 수 있다.
		case 3: coupon += "10,000원 ";
		case 2: coupon += "5,000원 ";
		case 1: coupon += "1,000원 "; 
		}
		System.out.println(coupon + "을 지급");
	}

}
