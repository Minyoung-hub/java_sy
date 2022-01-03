package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		++i;
		System.out.println("i : " + i);
		i++;
		System.out.println("i : " + i);
		
		i = 0; // 초기화가 아니라 i를 0으로 할당한다고 한다.
		int j = ++i;
		System.out.printf("i : %d, j : %d\n", i, j);
		
		i = 0; 
		j = i++;
		System.out.printf("i : %d, j : %d\n", i, j);

	}

}
