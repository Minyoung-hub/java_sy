package ch06.ex05.case11;

public class TestMain {
	public static void main(String[] args) {
		AppleSw appleSw = new AppleSw();
		GoogleSw googleSw = new GoogleSw();
		
		TeslaHw car1 = new TeslaHw(appleSw);
		TeslaHw car2 = new TeslaHw(googleSw);
		
		car1.start();
		car1.stop();
		car1.klaxon();
		System.out.println();
		
		car2.start();
		car2.stop();
		car2.klaxon();
	}
}