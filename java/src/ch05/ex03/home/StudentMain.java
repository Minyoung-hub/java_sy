package ch05.ex03.home;

public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name("최한석");
		student1.age(20);
		student2.name("한아름");
		student2.age(30);
		
		student1.wakeUp();
		student1.washFace();
		student2.studyHard();
	}
}