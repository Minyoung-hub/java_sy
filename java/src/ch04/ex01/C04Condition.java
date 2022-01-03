package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0<a && a<4) System.out.println("(0, 4)");
		
		char c = 'b';
		if('a'<c && c<'e') System.out.println("('a', 'e')");
		
		int x = 0;
		int y = 0;
		// x = 1 + 2;
		// if((x=1+2) || (y=1-2)) { 논리연산자에서 피연산자는 boolean타입이여야함
		// if(x>0 || --y>0)
		// 기능에 변화없이 코드만 건드리는 것 = refactoring
		if((x=1+2)>0 || (y=1-2)>0)
			System.out.printf("x : %d, y : %d\n", x, y);
		
		String s = "he";
		if(s.equals("he") || s.equals("HE"))
			System.out.println("he");
		
		if(s != null && !s.equals("")) // 값이 없는 상태를 표현, 해석하자면 '비문자열이 아니라면' 이다.
			System.out.println("문자열 있음");
		// s = null보다 s.equals("")를 쓰는게 좋다
		
		boolean flag = false;
		if(!flag) {
			System.out.println("전원을 켭니다.");
		}
	}
}
