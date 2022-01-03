package ch05.ex01.case04;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("최한석");
		person.setAge(25);
		
		System.out.printf("%s는 %d살입니다.", 
				person.getName(), person.getAge());
	}

}
