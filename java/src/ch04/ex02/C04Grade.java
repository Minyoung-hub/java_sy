package ch04.ex02;

public class C04Grade {
	public static void main(String[] args) {
		int score = 87;
		String grade = "";
		
		switch(score/10) {
		case 10 : case 9 :
			grade = "A";
			if(score > 95) grade += "+";
			break;
		case 8 :
			grade = "B";
			if(score > 85) grade += "+";
			break;
		case 7 :
			grade = "C";
			if(score > 75) grade += "+";
			break;
		default : grade = "D";
		}
		
		System.out.println(grade);
	}

}
