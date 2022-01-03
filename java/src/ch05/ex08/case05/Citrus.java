package ch05.ex08.case05;

public class Citrus {
	private String name;
	
	public Citrus() {
		this("귤"); // refactoring
		// this.name ="귤";
		// new Citrus("귤"); // 객체가 두개생성된다. 
		//여기서 생성되는 객체와 main에서 생성되는 new Citrus()이 
		//다른 객체 이므로 이 객체는 버리는 객체가 된다.
	}
	
	public Citrus(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
