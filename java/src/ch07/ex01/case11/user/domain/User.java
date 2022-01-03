package ch07.ex01.case11.user.domain;
// 데이터를 담을 공간
public class User {
	private String userName;
	private int point;
	
	public User(String userName, int point) {
		this.userName = userName;
		this.point = point;
	}
	
	public String toString() {
		return String.format("이름 : %s, 포인트 : %d", userName, point);
	}
}