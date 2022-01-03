package ch04.ex01;

public class C01If {
	public static void main(String[] args) {
		int visitCnt = 0;
		
		if(visitCnt < 1) { // 현재 전의 방문횟수를 카운트 한다.
			System.out.println("첫방문.");
			visitCnt++; // ++연산자 단독으로 쓰일 때는 연산자의 위치는 상관없다.
		}
		if(visitCnt < 1)  // visitCnt값이 1로 변해서 값이 출력되지 않는다.
			System.out.println("첫방문.");
		// 위처럼 블록 안에 문장이 하나인 경우 괄호를 쓰지 않아도 된다.
		// 명령문이 두 개 이상이면 꼭 괄호를 써줘야 한다.
		// 버그를 고치는 작업을 Debug한다고 한다.
		// 왼쪽 숫자 왼쪽의 여백을 더블클릭하면 점이 생기는데 이걸 break point라고 한다.
	}

}
