package ch05.ex05.case16;

public class Man {
	public void strip() {}
	public void wash() {}
	public void wear(Pajamas pajamas) {}
	public void lie() {}
	
	public void sleep(Pajamas pajamas) { // 멤버 메소드가 다른 멤버 메소드를 호출할 수 있다.
		this.strip(); // this.이 있으면 멤버로 읽으면됨 이거는 멤버메소드 strip이다.
		this.wash();
		wear(pajamas);
		lie();
	}
}