package ch06.ex04.case04;

public class TestMain {
	public static void main(String[] args) {
		Tablet tablet1 = new Tablet();
		Tablet tablet2 = new Tablet();
		System.out.println(tablet1.equals(tablet2));
		// 여기서 사용한 이퀄스 메소드는 오브젝트 객체에 있는 이퀄스로 왼쪽 오른쪽의
		// 문구가 아닌 주소 값을 비교하기 때문에 false 값을 리턴한다.
		
		Phone phone1 = new Phone("AW-001");
		Phone phone2 = new Phone("AW-001");
		System.out.println(phone1.equals(phone2));
		// 여기서 사용한 이퀄스 메소드는 폰 클래스에 있는 이퀄스로 왼쪽 오른쪽의
		// 문구를 비교해서 같으면 true 값을 리턴한다.
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1.equals(str2));
		// 여기서 사용한 이퀄스 메소드는 스트링 클래스에 있는 이퀄스로 왼쪽 오른쪽의
		// 문구를 비교해서 같으면 true 값을 리턴한다.
	}
}