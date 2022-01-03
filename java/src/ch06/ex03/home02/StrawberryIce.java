package ch06.ex03.home02;

public class StrawberryIce extends Icecream{
	private int price;
	
	public StrawberryIce(String name, int price) {
		super(name);
		this.price = price;
	}
	
	public String toString() {
		return String.format("아이스크림 이름은 %s, 가격은 %d", getName(), price);
	}
}