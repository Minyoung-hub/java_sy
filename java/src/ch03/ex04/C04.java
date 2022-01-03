package ch03.ex04;

public class C04 {
	public static void main(String[] args) {
		char upperCase = 'A'; 
		char lowerCase = (char)(upperCase + 32) ; 
		// A는 65, a는 97. 그래서 32를 더해준다.
		System.out.println("lowerCase : " + lowerCase);
	}

}
