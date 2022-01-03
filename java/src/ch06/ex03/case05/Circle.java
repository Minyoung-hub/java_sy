package ch06.ex03.case05;

public class Circle extends Point{
	private int radius;
	/*
	 * public Circle() {
		super();
	}
	아무것도 없을 때 이게 기본으로 생기겠지만 Point 클래스에 기본생성자가 없으므로
	컴파일에러로 뜬다.
	 */
	public Circle(int x, int y, int radius) {
		super(x, y);
		// super를 통해 초기화를  point class에게 맡긴다.
		this.radius = radius;
	}
	
	public String toString() {
		return String.format("중심점(%d, %d) 반지름 : %d",
				this.getX(), this.getY(), this.radius);
	}
}