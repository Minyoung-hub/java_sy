package ch07.ex03.case09;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		Integer[] array1 = {1, 2, 3};
		String[] array2 = {"a", "b", "c"};
		
		int i = box.getLastVal(array1);
		String s = box.getLastVal(array2);
		System.out.printf("%d %s", i, s);
	}
}