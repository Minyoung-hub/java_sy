package ch06.ex04.case06;

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
	// 내가 호출하게 된 결론 클래스의 멤버 변수가 그 클래스의 변수로 들어가게된다.
	// 예를들면 위의 오버라이드한 클래스는 원래 부모 클래스에도 있었지만 
	// 자식 클래스에서도 똑같이 오버라이딩 한 것이므로 결과적으로 자식 클래스에 
	// 있는 것이 실행된다. 이 때 이 안에 있는 price 변수는 자식클래스가 정의한
	// price 변수를 말하는 것이다.
}