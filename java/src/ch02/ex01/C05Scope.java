package ch02.ex01;

public class C05Scope {

	public static void main(String[] args) {
		int i = 0;
		//int i = 0;
		int j = 0;
		{
			//int i = 0;
			int x = 0;
			int y = 0;
		} // 이 시점에서 x, y는 메모리에서 없어진다.
		int x = 0;
	} // 이 시점에서 모든 변수는 메모리에서 없어진다.

}
