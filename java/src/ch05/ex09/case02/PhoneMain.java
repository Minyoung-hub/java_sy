package ch05.ex09.case02;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone(1000);
		Phone phone4 = new Phone();
		
		System.out.printf("Phone1 : %d\n", phone1.getSerialNo());
		System.out.printf("Phone2 : %d\n", phone2.getSerialNo());
		System.out.printf("Phone3 : %d\n", phone3.getSerialNo());
		System.out.printf("Phone4 : %d\n", phone4.getSerialNo());
	}
}