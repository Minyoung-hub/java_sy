package ch06.ex02.case02;

public class Parent {
	private int juminNum;
	private String name;
	private int wealth;
	
	private int getJuminNum() {
		return juminNum;
	}
	
	public String getName() {
		return name;
	}
	
	protected int getWealth() {
		return wealth;
	}
	
	void addMoney(int money) {
		this.wealth = wealth;
	}
}