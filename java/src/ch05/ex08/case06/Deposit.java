package ch05.ex08.case06;

public class Deposit {
	private int money;
	
	public Deposit() {
		this(100, 0); // 세번째 생성자를 가리킨다.
		// this.money = 100 + 0;과 같은말인데 중복되서 위처럼 씀.
	}
	
	public Deposit(int principal) {
		this(principal, 0); // 세번째 생성자를 가리킨다.
		// this.money = principal + 0;과 같은말인데 중복되서 위처럼 씀.
	}
	
	public Deposit(int principal, int interest) {
		this.money = principal + interest;
	}
	
	public String toString() {
		return money + "";
	}
}
