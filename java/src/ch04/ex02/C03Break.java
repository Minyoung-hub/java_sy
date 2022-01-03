package ch04.ex02;

public class C03Break {
	public static void main(String[] args) {
		int score = 95;
		char grade = 0;
		
		switch(score/10) {
		case 10 : case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		default : grade = 'D'; // 마지막꺼 뒤에는 break 안해도 된다. 낭비임.
		// (break를 안썼을 때)값을 하나만 저장할 수 있기 때문에 가장 마지막 값이 나오게 된다.
		}
		
		System.out.println(grade);
	}

}
