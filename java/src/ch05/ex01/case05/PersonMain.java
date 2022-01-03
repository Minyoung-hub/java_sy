package ch05.ex01.case05;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person(); // Person객체 만듦.(한사람이 있다)
		
		person.setName("최한석"); //(그 사람의 이름은 최한석이다)
		person.setAge(25); //(그 사람의 나이는 25살이다)
		System.out.printf("이름은 %s, 나이는 %d살.\n", person.getName(7), person.getAge(7));
		System.out.printf("이름은 %s, 나이는 %d살.\n", person.getName(4), person.getAge(4));
		
		person.setName("한아름");
		person.setAge(33);
		System.out.printf("이름은 %s, 나이는 %d살.\n", person.getName(7), person.getAge(7));
		
		//setter를 이용하면 data의 무결성을 지킬 수 있다.
		//getter로 데이터를 보안할 수 있다.
		
		person.name = "양승일";
		person.age = 50;
		String name = person.name;
		int age = person.age;
	}

}
