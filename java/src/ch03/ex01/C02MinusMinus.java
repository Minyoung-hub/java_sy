package ch03.ex01;

public class C02MinusMinus {
	public static void main(String[] args) {
		int i = 9;
		--i;
		System.out.println("i : " + i);
		i--;
		System.out.println("i : " + i);
		
		i = 9; 
		int j = --i;
		System.out.printf("i : %d, j : %d\n", i, j);
		
		i = 9; 
		j = i--;
		System.out.printf("i : %d, j : %d\n", i, j);
		j = i--;
		System.out.printf("i : %d, j : %d\n", i, j);

	}

}
