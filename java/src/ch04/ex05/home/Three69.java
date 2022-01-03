package ch04.ex05.home;

public class Three69 {
	public static void main(String[] args) {
		for(int i = 1; i<=99; i++) {
			System.out.printf(" %d", i);
		
			int ten = i / 10;
			int one = i % 10;
			if(one % 3 == 0 && one != 0) System.out.print("짝");
			if(ten % 3 == 0 && ten != 0) System.out.print("짝");

			if(i % 10 == 0) System.out.println();
			}
		}

	}

