package ch03.ex06.home;

public class Pi {
	public static void main(String[] args) {
		double pi = 3.141592;
		double result = 0;
		result = pi - (pi % 1);
		System.out.println(result);
	}
}
