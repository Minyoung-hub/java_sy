package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		Car car = new FireEngine();
		// FireEngine을 소방차가 아닌 차로서 보겠다는 의미
		car.drive();
		// car.water(); FireEngine을 소방차로 보지 않기 떄문에 
		// water메소드를 사용할 수 없다.
		// FireEngine이 Car타입이기 때문에 water 메소드 호출불가
		
		FireEngine fireEngine = (FireEngine)car;
		// 부모가 자식타입으로 올때 캐스팅만 가능
		fireEngine.drive();
		fireEngine.water();
		// 소방차 타입으로 있게되면 water메소드 호출가능
		
		((Car)fireEngine).drive();
		// ((Car)fireEngine).water();
		// Car타입이기 때문에 water메소드 호출불가.
	}
}