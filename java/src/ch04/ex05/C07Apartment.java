package ch04.ex05;

public class C07Apartment {
	public static void main(String[] args) {
		for(int i=5; i>0; i--) {
			for(int j =1; j<6; j++) {
				System.out.printf("[%d0%d호]", i, j);
			}
			System.out.println();
		}
	}

}
