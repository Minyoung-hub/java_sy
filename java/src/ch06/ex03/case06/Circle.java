package ch06.ex03.case06;

public class Circle extends Point{
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	public String toString() {
		return String.format("중심점(%d, %d) 반지름 : %d", x, y, r);
	// protected는 자식이 바로 접근 가능하기 때문에 this.getX()로 쓸 필요없이,
	// 곧바로 접근하기 때문에 코드가 깔끔해질 수 있다.
	}
}