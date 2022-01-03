package ch06.ex04.case07;

public class Shoes extends Product{
	private int price;
	
	public Shoes(int price) {
		super(price);
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}
	
	public String toString() {
		return String.format("%,d원 절반할인해서 %,d원에 판매."
				, super.price, this.price);
		//siper.price는 부모 클래스에 있는 것, this.price는 자식 클래스에 있는 것
	}
}