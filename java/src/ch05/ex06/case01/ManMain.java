package ch05.ex06.case01;

public class ManMain {
	public static void main(String[] args) {
		Man.say("자바를 사랑합니다.");
		// Man.tell("");
		
		Man man = new Man(); //인스턴트를 만들려면 new해서 꼭 이 줄이 추가되어야함.
		man.say("자바를 사랑합니다.");
		man.tell("역시 자바입니다."); 
	}
}