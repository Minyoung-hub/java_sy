package ch06.ex03.home01;

public class Circle{
	private int r;
	Point point;
	
	public Circle(int x, int y, int r) {
		point = new Point();
		point.setX(x);
		point.setY(y);
		this.r = r;
	}
	
	public String toString() {
		return String.format("중심점(%d, %d) 반지름 : %d", 
				point.getX(), point.getY(), r);
	}
}